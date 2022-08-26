package com.sprint.springCore4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BankAccountController {
	
	private BankAccountServiceImp bankAccountServiceImp;
	
	public double withdraw(long accountId, double balance) {
	return	bankAccountServiceImp.withdraw(accountId, balance);

	}
	
	public double deposit(long accountId, double balance) {
	return bankAccountServiceImp.deposit(accountId, balance);	
	}
	
	public double getBalance(long accountId) {
		return bankAccountServiceImp.getBalance(accountId);
	}
	
}
