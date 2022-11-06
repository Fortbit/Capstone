package com.wellsfargo.SoftBank.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wellsfargo.SoftBank.model.FundTransfer;
import com.wellsfargo.SoftBank.repository.FundTransferRepository;

@Service
@Transactional
public class FundTransferService {
	@Autowired
	private FundTransferRepository frepo;

	public List<FundTransfer> getAllFunds(){
		return frepo.findAll();
	}
}

