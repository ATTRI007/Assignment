package com.sprint.springBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Customer {
	
	private Address address;
 
private String customerId;
 private String customerName;
 private int customerContact;
 

@Override
public String toString() {
	return "Customer [address=" + address + ", customerId=" + customerId + ", customerName=" + customerName
			+ ", customerContact=" + customerContact + "]";
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public int getCustomerContact() {
	return customerContact;
}
public void setCustomerContact(int customerContact) {
	this.customerContact = customerContact;
}

void displayInfo(){  
    System.out.println(customerId+" "+customerName);  
    System.out.println(address);  
}  
}
