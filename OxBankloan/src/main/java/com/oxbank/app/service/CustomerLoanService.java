package com.oxbank.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oxbank.app.entity.CustomerDetails;
import com.oxbank.app.repository.CustomerLoanRepository;
@Service
public class CustomerLoanService implements ICustomerLoan {

	@Autowired
	private CustomerLoanRepository customerLoanRepository;
	@Override
	public CustomerDetails addCustomer(CustomerDetails customerDetails) {
		// TODO Auto-generated method stub
		return customerLoanRepository.save(customerDetails);
	}

}
