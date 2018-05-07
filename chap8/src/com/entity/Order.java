package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Order entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Order implements java.io.Serializable {

	// Fields

	private Integer oid;
	private Userinfo userinfo;
	private String zipcode;
	private String phone;
	private String address;
	private Double total;
	private Set orderitems = new HashSet(0);

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** minimal constructor */
	public Order(Userinfo userinfo, String zipcode, String phone,
			String address, Double total) {
		this.userinfo = userinfo;
		this.zipcode = zipcode;
		this.phone = phone;
		this.address = address;
		this.total = total;
	}

	/** full constructor */
	public Order(Userinfo userinfo, String zipcode, String phone,
			String address, Double total, Set orderitems) {
		this.userinfo = userinfo;
		this.zipcode = zipcode;
		this.phone = phone;
		this.address = address;
		this.total = total;
		this.orderitems = orderitems;
	}

	// Property accessors

	public Integer getOid() {
		return this.oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}

	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getTotal() {
		return this.total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Set getOrderitems() {
		return this.orderitems;
	}

	public void setOrderitems(Set orderitems) {
		this.orderitems = orderitems;
	}

}