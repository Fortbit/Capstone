package com.wellsfargo.SoftBank.model;

import javax.persistence.*;

@Entity
@Table(name="FixedDeposits")

public class FixedDeposit {
	
	@Id
	private long fromaccount;
	private String fdproduct;
	private String fdperiod;
	private String amount;
	
	public FixedDeposit() {
		
	}
	
	public FixedDeposit(String fromaccount, String fdproduct, String fdperiod, String amount) {
		super();
		this.fdproduct = fdproduct;
		this.fdperiod = fdperiod;
		this.amount = amount;
	}

	public long getFromaccount() {
		return fromaccount;
	}
	public void setFromaccount(long fromaccount) {
		this.fromaccount = fromaccount;
	}
	public String getFdproduct() {
		return fdproduct;
	}
	public void setFdproduct(String fdproduct) {
		this.fdproduct = fdproduct;
	}
	public String getFdperiod() {
		return fdperiod;
	}
	public void setFdperiod(String fdperiod) {
		this.fdperiod = fdperiod;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	
	
	

}
