package com.hcl.retailbanking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.retailbanking.entities.CustomerCreationEntity;
import com.hcl.retailbanking.repositories.CustomerCreationRepository;

import com.hcl.retailbanking.entities.CustomerCreationEntity;

import com.hcl.retailbanking.service.RetailBankingService;

@Service
public class RetailBankingServiceImpl implements RetailBankingService {

	@Autowired
	CustomerCreationRepository customerCreationRepo;

	@Override
	public boolean validateUser(long id) {
		return false;
	}

	@Override
	public CustomerCreationEntity fetchAccountSummary(long id) {
		return null;
	}
	
}