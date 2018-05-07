<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>

<html>
<head>
<title></title>
<s:head/> 
</head>
<body><h1>添加用户信息</h1>
<table>
<s:form id="id" action="addUser">
   <s:textfield name="username" key="username"/>
   <s:password name="password" key="password"/>
   <s:password name="password1" key="password1"/>
 
   <s:submit  key="add"/>
</s:form>
</table>
</body>
</html>
