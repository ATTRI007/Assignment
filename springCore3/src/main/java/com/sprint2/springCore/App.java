package com.sprint2.springCore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Resource resource=new ClassPathResource("bankAccount.xml");
	       BeanFactory factory=new XmlBeanFactory(resource);
	       BankAccount ba=(BankAccount) factory.getBean("bankAccount");
	       /*BankAccountController controller=(BankAccountController) factory.getBean("bankAccountController");
	        double amount=controller.withdraw(ba.getAccountId(), 5652386);*/
	        System.out.println(ba);
	      
    }
}
