package com.oxbank.app.service;

import com.oxbank.app.entity.CustomerDetails;
import com.oxbank.app.entity.LoanDetails;
import com.oxbank.app.exception.AgeNotValidException;

public interface ILoanService {
	
	public LoanDetails createLoan(LoanDetails loanDetails);
	
	public String loanApprove(CustomerDetails customerDetails) throws AgeNotValidException;
	
	

}
