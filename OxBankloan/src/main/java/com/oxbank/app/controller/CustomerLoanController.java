package com.oxbank.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oxbank.app.entity.CustomerDetails;
import com.oxbank.app.service.CustomerLoanService;

@RestController
@RequestMapping("/customerLoan")
public class CustomerLoanController {
	
	@Autowired
	private CustomerLoanService customerLoanService;
	
	@PostMapping("/addCustomer")
	public CustomerDetails createLoan(@RequestBody CustomerDetails customerDetails)
	{
		return customerLoanService.addCustomer(customerDetails);
	}

}
