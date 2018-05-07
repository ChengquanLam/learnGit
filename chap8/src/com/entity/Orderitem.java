package com.entity;

/**
 * Orderitem entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Orderitem implements java.io.Serializable {

	// Fields

	private Integer itemId;
	private Order order;
	private Books books;
	private Integer quantity;

	// Constructors

	/** default constructor */
	public Orderitem() {
	}

	/** full constructor */
	public Orderitem(Order order, Books books, Integer quantity) {
		this.order = order;
		this.books = books;
		this.quantity = quantity;
	}

	// Property accessors

	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Books getBooks() {
		return this.books;
	}

	public void setBooks(Books books) {
		this.books = books;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}