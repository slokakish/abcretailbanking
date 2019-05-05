package com.hcl.retailbanking.service;

import org.springframework.stereotype.Service;

import com.hcl.retailbanking.entities.ManagePayee;

@Service
public interface ManagePayeeService {

	String deletePayee(long PayeeId);

	public ManagePayee doPayeeValidation(ManagePayee payee);

	public ManagePayee addPayee(ManagePayee payeeId);
	
	public String verifyPayee(int otp, Long payeeId);

}