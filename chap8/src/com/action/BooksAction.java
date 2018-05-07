package com.action;

import java.util.*;
import com.dao.BooksDao;
import com.entity.Books;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class BooksAction extends ActionSupport {
	private Books books;
	private List list;
	private Integer bid;
	private  Map cart;
	public Map getCart() {
		return cart;
	}

	public void setCart(Map cart) {
		this.cart = cart;
	}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public Books getBooks() {
		return books;
	}

	public void setBooks(Books books) {
		this.books = books;
	}
	public String addBooks(){
		BooksDao dao=new BooksDao();
		if(dao.add(getBooks())==1)
		return SUCCESS;
		else
			return ERROR;
	}
	public String listBooks(){//返回所有的图书列表
		BooksDao dao=new BooksDao();
		list=dao.listBooks();
		return SUCCESS;
		}
	public String viewDetails(){//查看图书详细信息
		BooksDao dao=new BooksDao();
		books=dao.searchById(bid);
		return SUCCESS;
		}
	public String balance(){//结账
		BooksDao dao=new BooksDao();
		books=dao.searchById(bid);
		return SUCCESS;
		}
	public String addCart(){//添加到购物车
		Map<String, Object> session = ActionContext.getContext().getSession();
		 cart = (Map) session.get("cart");
		// cart.remove("cart");
		  
		  // 如果session中从未写入过，则将建立的商品对象添加到ArrayList对象当中，并写入 session
		 //session.remove("cart");
		  if (cart == null) { 
			  cart = new HashMap();
		  session.put("cart", cart);
		  }
		// 判断书籍是否在购物车中
			CartItem cartItem = (CartItem) cart.get(books.getIsbn());
			// 如果书籍在购物车中，更新其数量.
			// 否则，创建一个条目到Map中.
			if (cartItem != null){
				cartItem.setQuantity(cartItem.getQuantity() + 1);
			cartItem.setTotal(cartItem.getQuantity()*books.getPrice());

			}
			else{
				CartItem cartItem1=new CartItem();
				cartItem1.setBooks(books);
				cartItem1.setQuantity(1);
				cartItem1.setTotal(cartItem1.getQuantity()*books.getPrice());
				cart.put(books.getIsbn(), cartItem1);
				session.put("cart", cart);
				
			}
			
		  return "success";
		  }
		 
		  
		  
		 
		
		
	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}
}
