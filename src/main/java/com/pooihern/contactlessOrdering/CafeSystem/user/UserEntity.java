package com.pooihern.contactlessOrdering.CafeSystem.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class UserEntity {

	@Id
	@GeneratedValue
	private Long userId;

	@Column
	private String name;

	@Column
	private String role;

	public UserEntity() {

	}

	public UserEntity(Long id, String name, String role) {
		this.userId = id;
		this.name = name;
		this.role = role;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
