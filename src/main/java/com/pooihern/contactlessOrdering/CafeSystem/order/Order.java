package com.pooihern.contactlessOrdering.CafeSystem.order;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pooihern.contactlessOrdering.CafeSystem.drinks.DrinksEntity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Order {
	@Id
	@GeneratedValue
	private Long id;

	private int tableNum;
	@OneToMany(mappedBy = "order")
	@JsonIgnore
	private List<DrinksEntity> orderedDrinks;
	private double subTotal;

	public Order() {

	}
	
	public Order(Long id, int tableNum, List<DrinksEntity> orderedDrinks) {
		super();
		this.id = id;
		this.tableNum = tableNum;
		this.orderedDrinks = orderedDrinks;
		this.setSubTotal(0);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getTableNum() {
		return tableNum;
	}

	public void setTableNum(int tableNum) {
		this.tableNum = tableNum;
	}

	public List<DrinksEntity> getOrderedDrinks() {
		return orderedDrinks;
	}

	public void setOrderedDrinks(List<DrinksEntity> orderedDrinks) {
		this.orderedDrinks = orderedDrinks;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	
	

}
