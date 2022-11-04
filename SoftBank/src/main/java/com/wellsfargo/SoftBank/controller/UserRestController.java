package com.wellsfargo.SoftBank.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wellsfargo.SoftBank.exception.ResourceNotFoundException;
import com.wellsfargo.SoftBank.model.Users;
import com.wellsfargo.SoftBank.service.UserRestService;

@RestController
//@CrossOrigin(origins="http://localhost:3000")
@RequestMapping(value = "/api")
public class UserRestController {
	@Autowired
	private UserRestService userService;

	@GetMapping("/alluser")
	public List<Users> getAllProducts() {
		return userService.listAll();   
	}

	@GetMapping("/user/{id}")
	public ResponseEntity<Users> getProductById(@PathVariable(value = "id") Long uId)
			throws ResourceNotFoundException {
		Users user = userService.getSingleUser(uId) 
				.orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + uId));
		return ResponseEntity.ok().body(user);
	}

	@PostMapping("/user")
	public ResponseEntity<Users> saveProduct(@Validated @RequestBody Users user) {

		Users u=userService.saveProduct(user);
		return ResponseEntity.ok(u);

	}

	    @PutMapping("/user/{id}")
	    public ResponseEntity<Users> updateProduct(@PathVariable(value = "id") Long uId,
	            @Validated @RequestBody Users u) throws ResourceNotFoundException {
	
	   	 Users user = userService.getSingleUser(uId)
	                .orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + uId));
	
	
	        user.setFname(u.getFname());
	        user.setLname(u.getLname());
	        user.setMiddle_name(u.getMiddle_name());
	        user.setSecurityAnswers(u.getSecurityAnswers());
	
	        final Users updatedProduct = userService.saveProduct(user);
	        return ResponseEntity.ok(updatedProduct);
	    }

	@DeleteMapping("/user/{id}")
	public Map<String, Boolean> deleteProduct(@PathVariable(value = "id") Long uId)
			throws ResourceNotFoundException{
		userService.getSingleUser(uId)
		.orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + uId));
		userService.delete(uId);

		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
