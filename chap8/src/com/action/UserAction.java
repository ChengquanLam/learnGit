package com.action;

import java.util.Map;

import org.hibernate.Session;
import org.hibernate.Transaction;



import com.dao.UserInfoDao;
import com.entity.Userinfo;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String addUser() throws Exception { //添加用户
		// TODO Auto-generated method stub
		Userinfo userinfo=new Userinfo();
		userinfo.setUsername(getUsername());
		userinfo.setPassword(getPassword());
		UserInfoDao dao=new UserInfoDao();
		int result=dao.add(userinfo);
		if(result==1)
		return SUCCESS;
		else return INPUT;
	}
	public String login() throws Exception { //登录
		// TODO Auto-generated method stub
		Map<String, Object> session = ActionContext.getContext().getSession();
		Userinfo userinfo=new Userinfo();
		userinfo.setUsername(getUsername());
		userinfo.setPassword(getPassword());
		UserInfoDao dao=new UserInfoDao();
		userinfo=dao.search(userinfo);
		if(userinfo!=null){
			session.put("user",userinfo);//用户信息保存在session中
		return SUCCESS;
		}
		else return INPUT;
	}
}
