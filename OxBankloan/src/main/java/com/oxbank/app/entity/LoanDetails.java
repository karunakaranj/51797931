package com.oxbank.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Loan_Details")
public class LoanDetails {
	@Id
	@GeneratedValue
	private long accountNumber;
	private String securityAddress;
	private boolean loanStatus;
	private double loanAmount;
	private String ApproverManagerId;
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getSecurityAddress() {
		return securityAddress;
	}
	public void setSecurityAddress(String securityAddress) {
		this.securityAddress = securityAddress;
	}
	public boolean isLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(boolean loanStatus) {
		this.loanStatus = loanStatus;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getApproverManagerId() {
		return ApproverManagerId;
	}
	public void setApproverManagerId(String approverManagerId) {
		ApproverManagerId = approverManagerId;
	}
	public LoanDetails(long accountNumber, String securityAddress, boolean loanStatus, double loanAmount,
			String approverManagerId, CustomerDetails customerDetails) {
		super();
		this.accountNumber = accountNumber;
		this.securityAddress = securityAddress;
		this.loanStatus = loanStatus;
		this.loanAmount = loanAmount;
		ApproverManagerId = approverManagerId;
	}
	public LoanDetails() {
		super();
	}
	@Override
	public String toString() {
		return "LoanDetails [accountNumber=" + accountNumber + ", securityAddress=" + securityAddress + ", loanStatus="
				+ loanStatus + ", loanAmount=" + loanAmount + ", ApproverManagerId=" + ApproverManagerId + "]";
	}

	
	
	

}
