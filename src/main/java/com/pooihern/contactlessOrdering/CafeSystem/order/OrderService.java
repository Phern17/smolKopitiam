package com.pooihern.contactlessOrdering.CafeSystem.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	@Autowired
	private OrderRepo orderRepo;

	public OrderService(OrderRepo orderRepo) {
		super();
		this.orderRepo = orderRepo;
	}
	
	public void process(Order order) {
		
	}
}
