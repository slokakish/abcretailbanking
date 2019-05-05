package com.hcl.retailbanking.pojos;

import java.util.Date;

public class CustomerCreation {

	private long customerId;
	private String customerName;
	private Date customerDOB;
	private long customerPhoneNumber;
	private String accountType;
	private double balance;
	private Date accountCreationTimestamp;

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getCustomerDOB() {
		return customerDOB;
	}

	public void setCustomerDOB(Date customerDOB) {
		this.customerDOB = customerDOB;
	}

	public long getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(long customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Date getAccountCreationTimestamp() {
		return accountCreationTimestamp;
	}

	public void setAccountCreationTimestamp(Date accountCreationTimestamp) {
		this.accountCreationTimestamp = accountCreationTimestamp;
	}

	@Override
	public String toString() {
		return "CustomerCreation [customerId=" + customerId + ", customerName=" + customerName + ", customerDOB="
				+ customerDOB + ", customerPhoneNumber=" + customerPhoneNumber + ", accountType=" + accountType
				+ ", balance=" + balance + ", accountCreationTimestamp=" + accountCreationTimestamp + "]";
	}

}