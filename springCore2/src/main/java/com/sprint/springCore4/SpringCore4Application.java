package com.sprint.springCore4;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sprint.springCore4.BankAccount;
import com.sprint.springCore4.BankAccountController;


@SpringBootApplication
public class SpringCore4Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCore4Application.class, args);
	}

}
