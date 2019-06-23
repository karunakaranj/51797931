package com.oxbank.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oxbank.app.entity.CustomerDetails;

@Repository
public interface CustomerLoanRepository extends JpaRepository<CustomerDetails, Integer> {

	public CustomerDetails findById() ;
}
