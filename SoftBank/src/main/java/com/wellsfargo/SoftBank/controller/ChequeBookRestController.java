package com.wellsfargo.SoftBank.controller;

import java.util.List;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.wellsfargo.SoftBank.exception.ResourceNotFoundException;
import com.wellsfargo.SoftBank.model.ChequeBook;
import com.wellsfargo.SoftBank.repository.ChequeBookRepository;
import com.wellsfargo.SoftBank.service.ChequeBookService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ChequeBookRestController {
	
	@Autowired
	private ChequeBookRepository cbrepo;
	
	
	// Feature : Request ChequeBook from the browser
	@PostMapping("/newchequebook")
	public ChequeBook cbcust(@RequestBody ChequeBook cb) {
		return cbrepo.save(cb);
	}
	
		
	}
	



