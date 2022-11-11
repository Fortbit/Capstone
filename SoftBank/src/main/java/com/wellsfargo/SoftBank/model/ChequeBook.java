package com.wellsfargo.SoftBank.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ChequeBook {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Checkbook_Id;
	
	private String accountNumber;
	private String priority;
	private Date issueDate;

	LocalDate requestDate = LocalDate.now();
	
	
	public ChequeBook() {
	
	}
	
	public ChequeBook(Long checkbook_Id, String accountNumber, String priority, Date issueDate,
			LocalDate requestDate) {
		super();
		Checkbook_Id = checkbook_Id;
		this.accountNumber = accountNumber;
		this.priority = priority;
		this.issueDate = issueDate;
		this.requestDate = requestDate;
	}


	public Long getCheckbook_Id() {
		return Checkbook_Id;
	}

	public void setCheckbook_Id(Long checkbook_Id) {
		Checkbook_Id = checkbook_Id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public LocalDate getDate() {
		return requestDate;
	}

	public void setDate(LocalDate requestDate) {
		this.requestDate = requestDate;
	}
}
