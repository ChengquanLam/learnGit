package com.dao;


import org.hibernate.Session;
import org.hibernate.Transaction;


import com.entity.Orderitem;

public class OrderitemDao {

	public int add(Orderitem orderitem) {
		int result = 0;
		Session s = HibernateSessionFactory.getSession();
		Transaction tx = s.beginTransaction();
		try {
			s.save(orderitem);
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
