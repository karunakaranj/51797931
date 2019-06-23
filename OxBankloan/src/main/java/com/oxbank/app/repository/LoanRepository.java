package com.oxbank.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oxbank.app.entity.LoanDetails;

@Repository
public interface LoanRepository extends JpaRepository<LoanDetails, Long> {
	
	

}
