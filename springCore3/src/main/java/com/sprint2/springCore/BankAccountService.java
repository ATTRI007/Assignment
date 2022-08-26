package com.sprint2.springCore;

public interface BankAccountService {
	public double withdraw(long accountId , double balance);
	public double deposit (long accountId , double balance);
	public double getBalance(long accountId );
	public boolean fundTransfer(long fromAccount, long toAccount, double ammount);

}
