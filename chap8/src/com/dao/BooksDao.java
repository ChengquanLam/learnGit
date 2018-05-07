package com.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


import com.entity.Books;
import com.entity.Userinfo;

public class BooksDao {
	public Books searchById(Integer id){ //根据id返回Books
		Books books;
		Session session=HibernateSessionFactory.getSession();
		books=(Books)session.get(Books.class,id);
		return books;
		
	}
	public int add(Books book){ //添加图书
		int result=0;
		Session s=HibernateSessionFactory.getSession();
		Transaction tx=s.beginTransaction();
		try{
			
			Books books=new Books();
			books.setAuthor(book.getAuthor());
			books.setIsbn(book.getIsbn());
			books.setPrice(book.getPrice());
			books.setTitle(book.getTitle());
			s.save(book);
			tx.commit();
			s.close();
			result=1;
		}catch(Exception e){
			tx.rollback();
			e.printStackTrace();
			
		}
		
		
		
		return result;
	}
	public List listBooks(){//返回全部图书列表
		List list;
		Session s=HibernateSessionFactory.getSession();
		Transaction tx=s.beginTransaction();
		String hql="from Books b ";
		Query query=s.createQuery(hql);
		list=query.list();
		return list;
		
	}

}
