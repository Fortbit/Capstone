package com.wellsfargo.SoftBank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wellsfargo.SoftBank.model.Transactions;
import com.wellsfargo.SoftBank.service.TransactionService;

@RestController
@RequestMapping(value="/api")

public class TransactionsController {
	@Autowired
	private TransactionService tservice;
	
	@PostMapping("/transactions")
	public Transactions transactcust(@Validated @RequestBody Transactions trans) {
		
		Transactions t=new Transactions();
		t.setAccountNumber(trans.getAccountNumber());
		t.setAccountTypeID(trans.getAccountTypeID());
		t.setTransactionType(trans.getTransactionType());
		t.setTransactionDate(trans.getTransactionDate());
		t.setAmount(trans.getAmount());
		
		t=tservice.transcatcust(t);
		
		return trans;
		
	}
	
	@GetMapping("/alltransactions")
	public List<Transactions> getAllTransactions(){
		return tservice.getAllTransactions();
		
	}

}
