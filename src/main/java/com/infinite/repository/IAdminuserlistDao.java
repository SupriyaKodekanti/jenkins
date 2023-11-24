package com.infinite.repository;

import java.util.List;
import com.infinite.model.CustomerLogin;

public interface IAdminuserlistDao {
	
	public List<CustomerLogin> getUsers();

}
