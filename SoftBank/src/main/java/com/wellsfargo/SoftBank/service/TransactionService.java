package com.wellsfargo.SoftBank.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wellsfargo.SoftBank.model.Transactions;
import com.wellsfargo.SoftBank.repository.TransactionsRepository;

@Service
@Transactional
public class TransactionService {
	
	@Autowired
	private TransactionsRepository trepo;
	
	public Transactions transcatcust(Transactions t) {
		return trepo.save(t);
	}
	
	public List<Transactions> getAllTransactions(){
		return trepo.findAll();
	}

}
