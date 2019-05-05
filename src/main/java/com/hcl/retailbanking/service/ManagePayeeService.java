package com.hcl.retailbanking.service;

import org.springframework.stereotype.Service;
import java.util.List;

import com.hcl.retailbanking.entities.ManagePayee;
import com.hcl.retailbanking.pojos.CustomerCreation;

import com.hcl.retailbanking.entities.ManagePayee;

@Service
public interface ManagePayeeService {

	public void deletePayee(long payeeId);
	public String deletePayee(long customer_id);

	public ManagePayee doPayeeValidation(ManagePayee payee);

	public ManagePayee addPayee(ManagePayee payeeId);

	public List<ManagePayee> getPayee(Long id);

}
