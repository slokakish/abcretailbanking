package com.hcl.retailbanking.service;

import org.springframework.stereotype.Service;

import com.hcl.retailbanking.entities.ManagePayee;

@Service
public interface ManagePayeeService {

	public void deletePayee(long payeeId);

	public ManagePayee doPayeeValidation(ManagePayee payee);

	public ManagePayee addPayee(ManagePayee payeeId);

}