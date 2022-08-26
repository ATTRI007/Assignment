package com.sprint2.springCore;

public class BankAccount {
 private long accountId;
 private String accountHolderNam;
 private String accountType;
 private double accountBalance;
public double getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
}

public long getAccountId() {
	return accountId;
}
public void setAccountId(long accountId) {
	this.accountId = accountId;
}
public String getAccountHolderNam() {
	return accountHolderNam;
}
public void setAccountHolderNam(String accountHolderNam) {
	this.accountHolderNam = accountHolderNam;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}

@Override
public String toString() {
	return "BankAccount [accountId=" + accountId + ", accountHolderNam=" + accountHolderNam + ", accountType="
			+ accountType + ", accountBalance=" + accountBalance + "]";
}
}
