package com.hcl.retailbanking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.retailbanking.entities.ManagePayee;

@Service
public interface ManagePayeeService {

	String deletePayee(long PayeeId);

	public ManagePayee doPayeeValidation(ManagePayee payee);

	public ManagePayee addPayee(ManagePayee payeeId);
	
	public String verifyPayee(int otp, Long payeeId);
	
	public String verificationDeletePayee(int otp, Long payeeId);
	
	public List<ManagePayee> getPayee(Long payee_id);
	
	public List<ManagePayee> getAllPayee();

}