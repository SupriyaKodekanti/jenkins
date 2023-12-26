package com.infinite.service;

import java.util.List;

import com.infinite.model.VendorLogin;

public interface IVendorService {
	public void addVendor(VendorLogin vendorLogin);
	public VendorLogin validateUser(String username, String password);
	public List<VendorLogin> getVendors();
}
