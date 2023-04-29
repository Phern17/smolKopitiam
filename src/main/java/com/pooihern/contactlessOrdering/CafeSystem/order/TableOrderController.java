package com.pooihern.contactlessOrdering.CafeSystem.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TableOrderController {
	@Autowired
	private OrderService orderService;

	@PostMapping
	public void orderDrinks(@RequestBody Order newOrder) {
		orderService.process(newOrder);
	}

}
