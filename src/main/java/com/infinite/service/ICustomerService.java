package com.infinite.service;

import java.util.List;

import com.infinite.model.CustomerLogin;
public interface ICustomerService {
	public void addCustomer(CustomerLogin customerLogin);
	public CustomerLogin validateUser(String username, String password);
	public List<CustomerLogin> getCustomers();
}
