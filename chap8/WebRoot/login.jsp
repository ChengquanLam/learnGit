<%@ page language="java" pageEncoding="gb2312"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<!-- struts2标签库调用声明 -->
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>注册页面</title>
	<s:head/>
</head>
<body>
	<!-- 用户登录表单 -->
	<!-- validate="true"表示客户端校验 -->
	<h1>用户登录</h1>
	<s:label></s:label>
	<s:form action="login.action"  validate="true">
	
		<table width="40%" height="76" border="0">
				<!-- 各标签定义 -->
				<s:textfield name="username" label="用户名"/>
				<s:password name="password" label="密  码" />
				<s:submit value="登录" align="center"/>				
		</table>
	</s:form>
</body>
</html>
