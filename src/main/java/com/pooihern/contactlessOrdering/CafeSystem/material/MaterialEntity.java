package com.pooihern.contactlessOrdering.CafeSystem.material;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class MaterialEntity {

	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String name;
	@Column
	private int costPerUnit;
	@Column
	private String MeasurementUnit;

	public MaterialEntity() {

	}

	public MaterialEntity(Long id, String name, int costPerUnit, String measurementUnit) {
		super();
		this.id = id;
		this.name = name;
		this.costPerUnit = costPerUnit;
		MeasurementUnit = measurementUnit;
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

	public int getCostPerUnit() {
		return costPerUnit;
	}

	public void setCostPerUnit(int costPerUnit) {
		this.costPerUnit = costPerUnit;
	}

	public String getMeasurementUnit() {
		return MeasurementUnit;
	}

	public void setMeasurementUnit(String measurementUnit) {
		MeasurementUnit = measurementUnit;
	}

}
