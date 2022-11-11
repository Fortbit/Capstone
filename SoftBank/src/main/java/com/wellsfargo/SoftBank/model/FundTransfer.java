package com.wellsfargo.SoftBank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fundTransfer")
public class FundTransfer {
	@Id
	private long fromaccount;
	private String benefecaccno;
	private String benefecifsc;
	private String amount;
	private String benefec;
	private String benefecacctype;
	
	public FundTransfer() {
		
	}
	
	public FundTransfer(long fromaccount, String benefecaccno, String benefecifsc, String amount, String benefec,
			String benefecacctype) {
		super();
		this.fromaccount = fromaccount;
		this.benefecaccno = benefecaccno;
		this.benefecifsc = benefecifsc;
		this.amount = amount;
		this.benefec = benefec;
		this.benefecacctype = benefecacctype;
	}
	public long getFromaccount() {
		return fromaccount;
	}
	public void setFromaccount(long fromaccount) {
		this.fromaccount = fromaccount;
	}
	public String getBenefecaccno() {
		return benefecaccno;
	}
	public void setBenefecaccno(String benefecaccno) {
		this.benefecaccno = benefecaccno;
	}
	public String getBenefecifsc() {
		return benefecifsc;
	}
	public void setBenefecifsc(String benefecifsc) {
		this.benefecifsc = benefecifsc;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getBenefec() {
		return benefec;
	}
	public void setBenefec(String benefec) {
		this.benefec = benefec;
	}
	public String getBenefecacctype() {
		return benefecacctype;
	}
	public void setBenefecacctype(String benefecacctype) {
		this.benefecacctype = benefecacctype;
	}
	
	
}