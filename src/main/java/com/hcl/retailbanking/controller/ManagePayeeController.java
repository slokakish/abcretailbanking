package com.hcl.retailbanking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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

}