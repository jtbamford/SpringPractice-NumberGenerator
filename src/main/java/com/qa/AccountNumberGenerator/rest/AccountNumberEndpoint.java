package com.qa.AccountNumberGenerator.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.qa.AccountNumberGenerator.service.IAccountNumberService;

@RestController
@RequestMapping("${base_endpoint}")
@CrossOrigin
public class AccountNumberEndpoint {
	
	@Autowired
	private IAccountNumberService service;
	
	@PostMapping("${create_endpoint}")
	public String createAccountNumber() {
		return service.createAccountNumber();
	}

}
