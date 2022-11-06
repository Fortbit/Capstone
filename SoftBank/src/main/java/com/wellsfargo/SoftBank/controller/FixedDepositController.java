package com.wellsfargo.SoftBank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wellsfargo.SoftBank.model.FixedDeposit;
import com.wellsfargo.SoftBank.service.FixedDepositService;

@RestController
@RequestMapping(value="/api")

public class FixedDepositController {
	@Autowired
	private FixedDepositService fdservice;
	
	@PostMapping("/fixeddeposits")
	public FixedDeposit fdcust(@Validated @RequestBody FixedDeposit fd) {
		FixedDeposit fx=new FixedDeposit();
		fx.setAccountNumber(fd.getAccountNumber());
		fx.setCustomerName(fd.getCustomerName());
		fx.setAmount(fd.getAmount());
		fx.setFd_Period(fd.getFd_Period());
		fx.setFd_no(fd.getFd_no());
		
		fx=fdservice.fdcust(fx);
		
		return fd;
		
		
	}
	@GetMapping("/allfixeddeposits")
	public List<FixedDeposit> getAllfixeddeposits(){
		return fdservice.getAllfixeddeposits();
		
	}
		
	}


