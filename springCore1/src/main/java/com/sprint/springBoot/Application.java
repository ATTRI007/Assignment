package com.sprint.springBoot;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class Application {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("customer.xml");
	       BeanFactory factory=new XmlBeanFactory(resource);
	       Customer customer=(Customer) factory.getBean("customer");
	       
	      System.out.println(customer);
	}

}
