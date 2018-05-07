package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Userinfo entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Userinfo implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String username;
	private String password;
	private Set orders = new HashSet(0);

	// Constructors

	/** default constructor */
	public Userinfo() {
	}

	/** minimal constructor */
	public Userinfo(String username, String password) {
		this.username = username;
		this.password = password;
	}

	/** full constructor */
	public Userinfo(String username, String password, Set orders) {
		this.username = username;
		this.password = password;
		this.orders = orders;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

}