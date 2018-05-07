package com.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Order;

public class OrderDao {

	public int add(Order order) {
		int result = 0;
		Session s = HibernateSessionFactory.getSession();
		Transaction tx = s.beginTransaction();
		try {
			s.save(order);
			tx.commit();
			s.close();
			result = 1;
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();

		}

		return result;
	}

}
