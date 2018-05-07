package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Books entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Books implements java.io.Serializable {

	// Fields

	private Integer bid;
	private String isbn;
	private String title;
	private String author;
	private Double price;
	private Set orderitems = new HashSet(0);

	// Constructors

	/** default constructor */
	public Books() {
	}

	/** minimal constructor */
	public Books(String isbn, String title, String author, Double price) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	/** full constructor */
	public Books(String isbn, String title, String author, Double price,
			Set orderitems) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
		this.orderitems = orderitems;
	}

	// Property accessors

	public Integer getBid() {
		return this.bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Set getOrderitems() {
		return this.orderitems;
	}

	public void setOrderitems(Set orderitems) {
		this.orderitems = orderitems;
	}

}