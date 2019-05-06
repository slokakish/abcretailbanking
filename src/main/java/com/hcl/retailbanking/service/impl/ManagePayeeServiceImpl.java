package com.hcl.retailbanking.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.retailbanking.entities.ManagePayee;
import com.hcl.retailbanking.repositories.ManagePayeeRepository;
import com.hcl.retailbanking.service.MailService;
import com.hcl.retailbanking.service.ManagePayeeService;

@Service
public class ManagePayeeServiceImpl implements ManagePayeeService {

	@Autowired
	ManagePayeeRepository managePayeeRepo;

	@Autowired
	MailService mailService;

	@Override
	public String deletePayee(long payeeId) {
		boolean payee = managePayeeRepo.existsById(payeeId);
		if (payee) {
			managePayeeRepo.deleteById(payeeId);
			return "Payee deleted successfully";
		} else
			return "Payee doesn't exist";
	}

	@Override
	public ManagePayee doPayeeValidation(ManagePayee payee) {
		ManagePayee payee1 = null;
		if (payee.getPayee_id() != null) {
			String generateOTP = MailService.generateOTP();
			payee.setOtp(Integer.valueOf(generateOTP));
			/*
			 * payee1 = managePayeeRepo.findById(payee.getId()).get(); if (payee1 == null) {
			 */
			mailService.sendOTPMail(payee.getCustomer_email_id(), generateOTP);
			payee1 = addPayee(payee);
			// }
		}

		return payee1;
	}

	@Override
	public ManagePayee addPayee(ManagePayee payeeId) {
		return managePayeeRepo.save(payeeId);
	}

	@Override
	public String verifyPayee(int otp, Long payeeId) {
		ManagePayee verifiedPayee = managePayeeRepo.findById(payeeId).get();
		if (verifiedPayee.getOtp() == otp) {
			return "Payee verified successfully!";
		} else {
			return "Payee verification failed!";
		}
	}

	@Override
	public String verificationDeletePayee(int otp, Long payeeId) {
		ManagePayee verifiedPayee = managePayeeRepo.findById(payeeId).get();
		if (verifiedPayee.getOtp() == otp) {
			managePayeeRepo.deleteById(verifiedPayee.getPayee_id());
			return "Payee verified and deleted successfully!";
		} else {
			return "Payee verification and deletion failed!";
		}
	}

	@Override
	public List<ManagePayee> getPayee(Long payee_id) {
		return managePayeeRepo.findAllByPayId(payee_id);
	}

	@Override
	public List<ManagePayee> getAllPayee() {
		return managePayeeRepo.findAll();
	}

}