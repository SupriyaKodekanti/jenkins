package com.infinite.repository;

import java.util.List;

import com.infinite.model.CustomerLogin;

public interface ICustomerDao {

	public CustomerLogin addCustomer(CustomerLogin customerLogin);

	public CustomerLogin validateuser(String username, String password);

	public List<CustomerLogin> getCustomers();
}
