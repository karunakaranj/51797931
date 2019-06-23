package com.oxbank.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oxbank.app.entity.LoanDetails;
import com.oxbank.app.service.LoanService;

@RestController
@RequestMapping("Loan")
public class LoanController {
	@Autowired
	private LoanService loanService;
	@PostMapping("/createLoan")
	public LoanDetails createLoan(@RequestBody LoanDetails loanDetails)
	{
		return loanService.createLoan(loanDetails);
		
	}

}
