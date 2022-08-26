package com.sprint2.springCore;

public class BankAccountController {
	private BankAccountServiceImp bankAccountServiceImp;
	
	public double withdraw(long accountId, double balance) {
	return	this.bankAccountServiceImp.withdraw(accountId, balance);

	}
	
	public double deposit(long accountId, double balance) {
	return bankAccountServiceImp.deposit(accountId, balance);	
	}
	
	public double getBalance(long accountId) {
		return bankAccountServiceImp.getBalance(accountId);
	}
	
}
