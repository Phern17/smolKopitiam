package com.pooihern.contactlessOrdering.CafeSystem.order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {

}
