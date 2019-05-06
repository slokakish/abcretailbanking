package com.hcl.retailbanking.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManagePayeeController {
	

 	@Autowired
	ManagePayeeService managePayeeService;

 	@DeleteMapping("/deletePayee")
	public String deletePayee(@RequestParam long customer_id) {
		String message = ManagePayeeService.deletePayee(customer_id);
	}

}
