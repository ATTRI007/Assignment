package com.sprint.springCore4;

import org.springframework.stereotype.Service;

@Service
public class BankAccountServiceImp implements BankAccountService {
private BankAccountRepositoryImp bankAccountRepositoryImp;

	@Override
	public double withdraw(long accountId, double balance) {
		// TODO Auto-generated method stub
		double balanceAfterWithdraw=0;
		balanceAfterWithdraw=bankAccountRepositoryImp.getBalance(accountId)-balance;
		return balanceAfterWithdraw ;
	}

	@Override
	public double deposit(long accountId, double balance) {
		// TODO Auto-generated method stub
		double balanceAfterdeposit=0;
		balanceAfterdeposit=bankAccountRepositoryImp.getBalance(accountId)+balance;
		return balanceAfterdeposit ;
		
	}

	@Override
	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		return bankAccountRepositoryImp.getBalance(accountId);
	}

	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double ammount) {
		// TODO Auto-generated method stub
		return false;
	}

}
