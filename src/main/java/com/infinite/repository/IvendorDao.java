package com.infinite.repository;

import java.util.List;

import com.infinite.model.VendorLogin;

public interface IvendorDao {
	
	public VendorLogin addVendor(VendorLogin vendorLogin);
	public VendorLogin validateuser(String username, String password);
	public List<VendorLogin> getVendors();
}