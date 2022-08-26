package com.sprint.springBoot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


class ApplicationTests {

	@Test
	void testCustomerEntity() {
		Resource resource=new ClassPathResource("customer.xml");
	       BeanFactory factory=new XmlBeanFactory(resource);
	       Customer customer=(Customer) factory.getBean("customer");
	       assertEquals("1",customer.getCustomerId());
	       assertEquals("vartika",customer.getCustomerName());
	       
	}

}
