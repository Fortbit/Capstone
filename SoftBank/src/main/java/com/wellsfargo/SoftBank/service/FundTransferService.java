package com.wellsfargo.SoftBank.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wellsfargo.SoftBank.model.FundTransfer;
import com.wellsfargo.SoftBank.model.User;
import com.wellsfargo.SoftBank.repository.FundTransferRepository;

@Service
@Transactional
public class FundTransferService {
	@Autowired
	private FundTransferRepository frepo; 
	
	@Autowired
	private UserRestService urservice;

	public List<FundTransfer> getAllFunds(){
		return frepo.findAll();
	}
	
	public String transferingFund (FundTransfer ft)
	{
		try 
		{
			User sender = urservice.getSingleUser(ft.getFromaccount());
			sender.setAccountBalance(sender.getAccountBalance()-Long.parseLong(ft.getAmount()));
			
			User reciever = urservice.getSingleUser(Long.parseLong(ft.getBenefecaccno()));
			reciever.setAccountBalance(reciever.getAccountBalance()+Long.parseLong(ft.getAmount()));
			return "Transfer successful";
		}
		catch (Exception e)
		{
			return "Transfer not successful"+e;
		}
	}
	
}

