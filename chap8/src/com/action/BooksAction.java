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
	public String listBooks(){//�������е�ͼ���б�
		BooksDao dao=new BooksDao();
		list=dao.listBooks();
		return SUCCESS;
		}
	public String viewDetails(){//�鿴ͼ����ϸ��Ϣ
		BooksDao dao=new BooksDao();
		books=dao.searchById(bid);
		return SUCCESS;
		}
	public String balance(){//����
		BooksDao dao=new BooksDao();
		books=dao.searchById(bid);
		return SUCCESS;
		}
	public String addCart(){//��ӵ����ﳵ
		Map<String, Object> session = ActionContext.getContext().getSession();
		 cart = (Map) session.get("cart");
		// cart.remove("cart");
		  
		  // ���session�д�δд������򽫽�������Ʒ������ӵ�ArrayList�����У���д�� session
		 //session.remove("cart");
		  if (cart == null) { 
			  cart = new HashMap();
		  session.put("cart", cart);
		  }
		// �ж��鼮�Ƿ��ڹ��ﳵ��
			CartItem cartItem = (CartItem) cart.get(books.getIsbn());
			// ����鼮�ڹ��ﳵ�У�����������.
			// ���򣬴���һ����Ŀ��Map��.
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
