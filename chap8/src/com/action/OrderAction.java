package com.action;

import java.util.*;

import com.dao.OrderDao;
import com.dao.OrderitemDao;
import com.entity.Order;
import com.entity.Orderitem;
import com.entity.Userinfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class OrderAction extends ActionSupport {
	private Order order;
	private double total; //图书总金额
	private  Map cart;
	private Userinfo user;
	public Userinfo getUser() {
		return user;
	}
	public void setUser(Userinfo user) {
		this.user = user;
	}
	public Map getCart() {
		return cart;
	}
	public void setCart(Map cart) {
		this.cart = cart;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
public String balance(){
	Map<String, Object> session = ActionContext.getContext().getSession();
	 cart = (Map) session.get("cart");
	 user=(Userinfo)session.get("user");
	CartItem item;
	Set keys = cart.keySet( );
	if(keys != null) {
	Iterator iterator = keys.iterator( );
	while(iterator.hasNext( )) {
	Object key = iterator.next( );
	item =(CartItem)cart.get(key);
	total+=item.getQuantity()*item.getBooks().getPrice();
	}
	}
	return SUCCESS;
}
public String addOrder(){
	Map<String, Object> session = ActionContext.getContext().getSession();
	 cart = (Map) session.get("cart");
	 user=(Userinfo)session.get("user");
	 OrderDao orderDao=new OrderDao();
	 OrderitemDao itemDao=new OrderitemDao();
	 Orderitem orderitem;
	 order.setUserinfo(user);
	 order.setTotal(getTotal());
	 try{
		 orderDao.add(order);//添加订单到表order
			CartItem item;
			Set keys = cart.keySet( );
			if(keys != null) {
			Iterator iterator = keys.iterator( );
			while(iterator.hasNext( )) {
			Object key = iterator.next( );
			item =(CartItem)cart.get(key);
			orderitem=new Orderitem();
			orderitem.setBooks(item.getBooks());
			orderitem.setOrder(order);
			orderitem.setQuantity(item.getQuantity());
			itemDao.add(orderitem);//添加清单到表orderitem
			}
			}
			session.remove("cart");
			return SUCCESS;
	 }catch(Exception e){
			
			e.printStackTrace();
			return ERROR;
			
		}
	
}
}