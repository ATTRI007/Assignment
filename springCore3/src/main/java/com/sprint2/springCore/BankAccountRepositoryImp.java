package com.sprint2.springCore;

import java.util.HashMap;
import java.util.Map;

public  class BankAccountRepositoryImp implements BankAccountRepository {
Map<Long,Double> bankDetails= new HashMap<>();

	public  BankAccountRepositoryImp() {
		this.bankDetails.put((long) 570899, 676398.89);
	
}

	@Override
	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		
	return	this.bankDetails.get(accountId);
		
	}

	@Override
	public double updateBalance(long accountId, double newBalance) {
		// TODO Auto-generated method stub
		this.bankDetails.put(accountId, newBalance);
		return this.bankDetails.get(accountId);
	}

}
