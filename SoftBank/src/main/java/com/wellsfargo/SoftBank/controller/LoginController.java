package com.wellsfargo.SoftBank.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wellsfargo.SoftBank.model.User;
import com.wellsfargo.SoftBank.response.ResponseHandler;
import com.wellsfargo.SoftBank.service.UserRestService;

@Controller
@RestController
public class LoginController {
	@Autowired
	private UserRestService cservice; 
	
	@PostMapping("/register")
	@CrossOrigin(origins="http://localhost:3000/")
	public ResponseEntity<Object> registerUser (@Validated @RequestBody User user)
	{
		 if(user.equals(cservice.getSingleUser(user.getAccount_no()))) {
			 return ResponseHandler.generateResponse("User Already Exists", HttpStatus.CONFLICT, null);
		 }
		 else {
			 cservice.saveUser(user);
			 return ResponseHandler.generateResponse("Registered", HttpStatus.OK, user.getAccount_no());
		 }
		
	}
	
	@PostMapping("/login")
	@CrossOrigin(origins="http://localhost:3000/")
	public ResponseEntity<Object> loginUser (@Validated @RequestBody Map<String,Object> cred ){
		
		long accountNumber = Long.parseLong((String) cred.get("accountNumber"));
		String password= (String) cred.get("password");
		
		if(password.equals(cservice.getSingleUser(accountNumber).getPassword()))
		{
			return ResponseHandler.generateResponse("Login Successful", HttpStatus.OK, cservice.getSingleUser(accountNumber).getAccount_no());
		}
		
		else {
			return ResponseHandler.generateResponse("Incorrect Password", HttpStatus.UNAUTHORIZED, null);
		}
	}
	
	

}

