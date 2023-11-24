package com.infinite.repository;

import java.util.List;
import com.infinite.model.OrderList;

public interface IAdmin_OrderDao {
	public List<OrderList> getOrderHistory();
	
}
