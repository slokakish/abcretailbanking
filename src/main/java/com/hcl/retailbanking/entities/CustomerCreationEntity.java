package com.hcl.retailbanking.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_creation")
public class CustomerCreationEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long customer_id;

	private String customer_name;
	private Date customer_dob;
	private Long customer_phone_number;
	private String account_type;
	private Double balance;
	private Date account_creation_timestamp;

	public Long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public Date getCustomer_dob() {
		return customer_dob;
	}

	public void setCustomer_dob(Date customer_dob) {
		this.customer_dob = customer_dob;
	}

	public Long getCustomer_phone_number() {
		return customer_phone_number;
	}

	public void setCustomer_phone_number(Long customer_phone_number) {
		this.customer_phone_number = customer_phone_number;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Date getAccount_creation_timestamp() {
		return account_creation_timestamp;
	}

	public void setAccount_creation_timestamp(Date account_creation_timestamp) {
		this.account_creation_timestamp = account_creation_timestamp;
	}

	@Override
	public String toString() {
		return "CustomerCreationEntity [customer_id=" + customer_id + ", customer_name=" + customer_name
				+ ", customer_dob=" + customer_dob + ", customer_phone_number=" + customer_phone_number
				+ ", account_type=" + account_type + ", balance=" + balance + ", account_creation_timestamp="
				+ account_creation_timestamp + "]";
	}

}