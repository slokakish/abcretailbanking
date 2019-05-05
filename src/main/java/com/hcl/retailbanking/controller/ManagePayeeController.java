package com.hcl.retailbanking.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.retailbanking.entities.ManagePayee;
import com.hcl.retailbanking.service.ManagePayeeService;

@RestController
@RequestMapping("/retailbanking")
public class ManagePayeeController {

	@Autowired
	ManagePayeeService managePayeeService;

	@PostMapping("/addPayee")
	public ResponseEntity<String> addPayee(@RequestBody ManagePayee managePayee) {
		ManagePayee payee = managePayeeService.doPayeeValidation(managePayee);

		if (payee != null) {
			ManagePayee addedPayee = managePayeeService.addPayee(payee);
			return new ResponseEntity<String>("Payee " + addedPayee.getPayee_name() + " has been added successfully!",
					HttpStatus.OK);
		}
		return new ResponseEntity<String>("Invalid payee details", HttpStatus.OK);
	}

	/*
	 * @DeleteMapping("/deletePayee") public String deletePayee(@RequestParam(name =
	 * "PayeeId", required = true) Long payeeId) { String message =
	 * managePayeeService.deletePayee(PayeeId); return message; }
	 */
	
	@GetMapping("/viewPayee/{id}")
	public List<ManagePayee> viewPayee(@PathVariable Long id){
		 return managePayeeService.getPayee(id);
	}
/*
	
	@PostMapping("addPayee")
	public CustomerCreationEntity addPayee(@RequestParam(name = "accountId", required = true) Long accountId,
			@RequestBody CustomerCreation customer) {
		if(customer.getCustomerId() == null) {
			boolean isAlreadyExist = managePayeeService.doPayeeValidation(accountId, customer.getCustomerId());
			
			if(!isAlreadyExist) {
				managePayeeService.addPayee(customer, accountId);
			}
		}
	}*/
}