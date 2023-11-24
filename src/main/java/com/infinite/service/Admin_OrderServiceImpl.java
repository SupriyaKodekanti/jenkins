package com.infinite.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.infinite.model.OrderList;
import com.infinite.repository.IAdmin_OrderDao;

@Service
public class Admin_OrderServiceImpl implements IAdmin_OrderService {

	@Autowired
	IAdmin_OrderDao iaohd;
	
	@Transactional
	public List<OrderList> getOrderHistory() {
		// TODO Auto-generated method stub
		return iaohd.getOrderHistory();
	}

}
