package com.qa.AccountNumberGenerator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.AccountNumberGenerator.constants.Constants;
import com.qa.AccountNumberGenerator.repository.IAccountNumberRepository;

@Service
public class AccountNumberService implements IAccountNumberService {

	@Autowired
	private IAccountNumberRepository repo;
	
	public String createAccountNumber() {
		return repo.createAccountNumber(Constants.ACCOUNT_NUMBER);
	}
	
}
