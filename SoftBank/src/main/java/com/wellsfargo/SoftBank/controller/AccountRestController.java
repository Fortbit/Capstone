package com.wellsfargo.SoftBank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wellsfargo.SoftBank.model.Account;
import com.wellsfargo.SoftBank.service.AccountService;

@RestController
@RequestMapping(value="/api")
public class AccountRestController {
	@Autowired
	private AccountService aservice;
	@GetMapping("/allaccounts")
	public List<Account> getAllAccounts(){
		return aservice.getAllAccounts();
	}
}
