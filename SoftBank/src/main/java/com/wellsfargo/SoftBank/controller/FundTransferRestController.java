package com.wellsfargo.SoftBank.controller;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wellsfargo.SoftBank.model.FundTransfer;
import com.wellsfargo.SoftBank.repository.FundTransferRepository;
import com.wellsfargo.SoftBank.service.FundTransferService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class FundTransferRestController {
	@Autowired
	private FundTransferRepository ftRepo;
	
	@Autowired
	private FundTransferService ftService ;
	
	
	@PostMapping("/fundtransfer")
	public FundTransfer ftcust(@RequestBody FundTransfer ft) {
		
		String fTransfer = ftService.transferingFund(ft);
		return ftRepo.save(ft);
		
	}
	 
}
