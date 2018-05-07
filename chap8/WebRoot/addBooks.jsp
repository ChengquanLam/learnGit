<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>

<html>
<head>
<title></title>
<s:head/> 
</head>
<body><h1>添加图书信息</h1>
<table>
<s:form id="id" action="addBooks">
   <s:textfield name="books.title" key="books.title"/>
   <s:textfield name="books.isbn" key="books.isbn"/>
   <s:textfield name="books.author" key="books.author"/>
   <s:textfield name="books.price" key="books.price"/>
   
   <s:submit  key="add"/>
</s:form>
</table>
</body>
</html>
