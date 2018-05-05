<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SUCCESS</title>
</head>
<body>
	
	<s:if test="%{username.isEmpty()||password.isEmpty()}">
<%-- 	<s:if test='{username == ""}'> --%>
		用户名或密码不能为空！<br>
	</s:if>
	
		欢迎您，
	<s:elseif test="%{username.equals('admin')}">
		管理员<br>
	</s:elseif>
	
	<s:else>
		<s:property value="username"/>
	</s:else>
	<s:iterator  value="#request.questionList">
		<s:property/><br />
	</s:iterator>
	<s:property value="sex" />
<%-- 	<s:select list=”aaaaList” /> --%>
</body>
</html>