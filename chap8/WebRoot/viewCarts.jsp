<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>

<html>
<head>
<title></title>
<s:head/> 
</head>
<body><h1>查看购物车信息</h1>
<s:form>
<table >
<tr><th>ISBN号</th><th>书名</th><th>数量</th><th>金额</th></tr>
<s:iterator value="#session.cart">
<tr> 

<td><s:property value="key" /></td>
<td><s:property value="value.books.title" /></td>
<td><s:property value="value.quantity"/></td>
<td><s:property value="value.total"/></td>
</tr>
</s:iterator>
<tr>
<td>
<s:submit type="button"  action="listBooks"  key="toviewbook" />
<s:submit type="button"  action="balance"  key="balance" />
</td>
</tr>
</table>
</s:form>
</body>
</html>
