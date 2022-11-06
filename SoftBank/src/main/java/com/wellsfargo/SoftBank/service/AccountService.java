package com.wellsfargo.SoftBank.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wellsfargo.SoftBank.model.Account;
import com.wellsfargo.SoftBank.repository.AccountRepository;

@Service
@Transactional
public class AccountService {
	@Autowired
	private AccountRepository arepo;

	public List<Account> getAllAccounts(){
		return arepo.findAll();
	}
}


