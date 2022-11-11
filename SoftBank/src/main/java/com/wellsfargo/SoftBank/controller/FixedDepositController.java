package com.wellsfargo.SoftBank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wellsfargo.SoftBank.model.FixedDeposit;
import com.wellsfargo.SoftBank.repository.FixedDepositRepository;
import com.wellsfargo.SoftBank.service.FixedDepositService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class FixedDepositController {
	
	@Autowired
	private FixedDepositRepository fdrepo;
	
	
	@PostMapping("/fixeddeposits")
	public FixedDeposit fdcust(@RequestBody FixedDeposit fd) {
		return fdrepo.save(fd);
	}
	
		
	}


