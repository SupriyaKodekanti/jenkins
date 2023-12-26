package com.infinite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infinite.model.CustomerLogin;
import com.infinite.repository.ICustomerDao;
@Service
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	ICustomerDao cdaoimpl;
	
	@Transactional
	public void addCustomer(CustomerLogin customerLogin) {
		// TODO Auto-generated method stub
		cdaoimpl.addCustomer(customerLogin);
	}

	@Transactional
	public CustomerLogin validateUser(String username, String password) {
		// TODO Auto-generated method stub
		return cdaoimpl.validateuser(username, password);
		
	}

	@Transactional
	public List<CustomerLogin> getCustomers() {
		// TODO Auto-generated method stub
		return cdaoimpl.getCustomers();
	}
	

}
