package com.oxbank.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oxbank.app.entity.CustomerDetails;
import com.oxbank.app.entity.LoanDetails;
import com.oxbank.app.exception.AgeNotValidException;
import com.oxbank.app.repository.CustomerLoanRepository;
import com.oxbank.app.repository.LoanRepository;
@Service
public class LoanService implements ILoanService{

	@Autowired
	private LoanRepository loanRepository;
	@Autowired
	private CustomerLoanRepository customerLoanRepository;
	@Override
	public LoanDetails createLoan(LoanDetails loanDetails) {
		// TODO Auto-generated method stub
		return loanRepository.save(loanDetails);
	}
	@Override
	public String loanApprove(CustomerDetails customerDetails)throws AgeNotValidException {
		// TODO Auto-generated method stub
		
		return null;
	}

}
