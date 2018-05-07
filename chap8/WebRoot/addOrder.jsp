<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>

<html>
<head>
<title></title>
<s:head/> 
</head>
<body><h1>添加订单信息</h1>
<table>
<s:form id="id" action="addOrder" validate="true">
   <s:textfield name="user.username" key="username" readonly="true"/>
   <s:textfield name="order.address" key="address"/>
   <s:textfield name="order.phone" key="phone"/>
   <s:textfield name="order.zipcode" key="zipcode"/>
   <s:textfield name="total" key="total" readonly="true"/>
   
   <s:submit  key="toOrder"/>
</s:form>
</table>
</body>
</html>
