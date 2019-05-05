package com.hcl.retailbanking.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "manage_payee")
public class ManagePayee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long payee_id;
	private String customer_email_id;
	private int otp;
	private Long payee_account_number;
	private String payee_name;

	public Long getPayee_id() {
		return payee_id;
	}

	public void setPayee_id(Long payee_id) {
		this.payee_id = payee_id;
	}

	public String getCustomer_email_id() {
		return customer_email_id;
	}

	public void setCustomer_email_id(String customer_email_id) {
		this.customer_email_id = customer_email_id;
	}

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}

	public Long getPayee_account_number() {
		return payee_account_number;
	}

	public void setPayee_account_number(Long payee_account_number) {
		this.payee_account_number = payee_account_number;
	}

	public String getPayee_name() {
		return payee_name;
	}

	public void setPayee_name(String payee_name) {
		this.payee_name = payee_name;
	}

	@Override
	public String toString() {
		return "ManagePayee [payee_id=" + payee_id + ", customer_email_id=" + customer_email_id + ", otp=" + otp
				+ ", payee_account_number=" + payee_account_number + ", payee_name=" + payee_name + "]";
	}

}