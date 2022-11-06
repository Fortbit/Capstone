package com.wellsfargo.SoftBank.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wellsfargo.SoftBank.model.FundTransfer;
import com.wellsfargo.SoftBank.service.FundTransferService;

@RestController
@RequestMapping(value="/api")
public class FundTransferRestController {
	@Autowired
	private FundTransferService fservice;
	@GetMapping("/allfunds")
	public List<FundTransfer> getAllFunds(){
		return fservice.getAllFunds();
	}
}
