package com.hcl.retailbanking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.retailbanking.entities.ManagePayee;
import com.hcl.retailbanking.repositories.ManagePayeeRepository;
import com.hcl.retailbanking.service.ManagePayeeService;

@Service
public class ManagePayeeServiceImpl implements ManagePayeeService {

	@Autowired
	ManagePayeeRepository managePayeeRepo;

	@Override
	public void deletePayee(long payeeId) {
		managePayeeRepo.deleteById(payeeId);
	}

	@Override
	public ManagePayee doPayeeValidation(ManagePayee payee) {
		 ManagePayee payee1 = null;
		if (payee.getPayee_id() != null) {
			/*payee1 = managePayeeRepo.findById(payee.getId()).get();
			if (payee1 == null) {*/
			payee1 = addPayee(payee);
			// }
		}

		return payee1;
	}

	@Override
	public ManagePayee addPayee(ManagePayee payeeId) {
		return managePayeeRepo.save(payeeId);
	}

}