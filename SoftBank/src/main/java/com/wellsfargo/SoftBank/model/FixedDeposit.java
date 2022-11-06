package com.wellsfargo.SoftBank.model;

import javax.persistence.*;

@Entity
@Table(name="FixedDeposits")

public class FixedDeposit {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long fd_no;
	
	private String AccountNumber;
	private String CustomerName;
	private int Fd_Period;
	private String Amount;
	
	
	public FixedDeposit() {
		super();
	}


	public long getFd_no() {
		return fd_no;
	}


	public void setFd_no(long fd_no) {
		this.fd_no = fd_no;
	}


	public String getAccountNumber() {
		return AccountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}


	public String getCustomerName() {
		return CustomerName;
	}


	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}


	public int getFd_Period() {
		return Fd_Period;
	}


	public void setFd_Period(int fd_Period) {
		Fd_Period = fd_Period;
	}


	public String getAmount() {
		return Amount;
	}


	public void setAmount(String amount) {
		Amount = amount;
	}
	
	
	
	

}
