package com.wellsfargo.SoftBank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wellsfargo.SoftBank.model.FixedDeposit;
import com.wellsfargo.SoftBank.repository.FixedDepositRepository;

@Service
@Transactional
public class FixedDepositService {

	@Autowired
	private FixedDepositRepository fdrepo;
	
	public FixedDeposit fdcust(FixedDeposit FixedDeposit) {
		return fdrepo.save(FixedDeposit);
	}
	
	public List<FixedDeposit> getAllfixeddeposits(){
		return fdrepo.findAll();
	}
}
