package com.qa.AccountNumberGenerator.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import static javax.transaction.Transactional.TxType.REQUIRED;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qa.AccountNumberGenerator.domain.AccountNumber;

@Repository
public class AccountNumberRepository implements IAccountNumberRepository {
	
	@Autowired
	private EntityManager em;
	
	private AccountNumber accountNumber;
	
	@Transactional(REQUIRED)
	public String createAccountNumber(String accountNumberInput) {
		accountNumber = new AccountNumber();
		accountNumber.setAccountNumber(accountNumberInput);
		em.persist(accountNumber);
		return accountNumber.getAccountNumber();
	}
	

}
