package com.pooihern.contactlessOrdering.CafeSystem.drinks;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pooihern.contactlessOrdering.CafeSystem.order.Order;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class DrinksEntity {
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String name;
	@Column
	private double price;
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private Order order;

	public DrinksEntity() {

	}

	public DrinksEntity(Long id, String name, double price, Order order) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.order = order;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}
