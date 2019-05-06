package com.hcl.retailbanking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

	@DeleteMapping("/deletePayee")
	public String deletePayee(@RequestParam(name = "PayeeId", required = true) long PayeeId) {
		String message = managePayeeService.deletePayee(PayeeId);
		return message;
	}

	@GetMapping("/verifyPayee")
	public ResponseEntity<String> verifyPayee(@RequestParam("otp") int otp, @RequestParam("payeeId") Long payeeId) {
		String verifyPayee = managePayeeService.verifyPayee(otp, payeeId);
		return new ResponseEntity<String>(verifyPayee, HttpStatus.OK);
	}

	@DeleteMapping("/verificationDeletePayee")
	public ResponseEntity<String> verificationDeletePayee(@RequestParam("otp") int otp,
			@RequestParam("payeeId") Long payeeId) {
		String verifyPayee = managePayeeService.verificationDeletePayee(otp, payeeId);
		return new ResponseEntity<String>(verifyPayee, HttpStatus.OK);
	}

	@GetMapping("/viewPayee/{payee_id}")
	public List<ManagePayee> viewPayee(@PathVariable Long payee_id) {
		return managePayeeService.getPayee(payee_id);
	}
	
	@GetMapping("/viewPayee")
	public List<ManagePayee> viewAllPayee() {
		return managePayeeService.getAllPayee();
	}

}