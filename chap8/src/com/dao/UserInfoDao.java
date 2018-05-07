package com.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


import com.entity.Userinfo;

public class UserInfoDao {
	public Userinfo search(Userinfo userinfo){ //根据用户名和密码查询，如果找到返回1，否则返回0
		int result=0;
		Session session=HibernateSessionFactory.getSession();
		String hql="from Userinfo u where u.username=? and u.password=?";
		Query query=session.createQuery(hql);
		query.setString(0,userinfo.getUsername());
		query.setString(1,userinfo.getPassword());
		List list=query.list();
		Iterator it=list.iterator();
		if(it.hasNext()){
			userinfo=(Userinfo)it.next();
			result=1;
		}
		return userinfo;
		
	}
	public int add(Userinfo user){
		int result=0;
		Session s=HibernateSessionFactory.getSession();
		Transaction tx=s.beginTransaction();
		try{
			
			Userinfo userinfo=new Userinfo();
			userinfo.setUsername(user.getUsername());
			userinfo.setPassword(user.getPassword());
			s.save(userinfo);
			tx.commit();
			s.close();
			result=1;
		}catch(Exception e){
			tx.rollback();
			e.printStackTrace();
			
		}
		
		
		
		return result;
	}

}
