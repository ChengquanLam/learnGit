<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>

<html>
<head>
<title></title>
<s:head/> 
</head>
<body><h1>查看图书详细信息</h1>
<table>

<s:form id="id" action="addCart"><s:hidden name="books.bid"/>
   书名：<s:property value="books.title" /><s:hidden name="books.title"/><br>
   ISBN：<s:property value="books.isbn" /><s:hidden name="books.isbn"/><br>
   作者：<s:property value="books.author" /><s:hidden name="books.author"/><br>
   价格：<s:property value="books.price" /><s:hidden name="books.price"/><br>
  
   <s:submit  key="addcart"/>
</s:form>
</table>
</body>
</html>
