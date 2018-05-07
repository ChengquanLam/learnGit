<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>

<html>
<head>
<title></title>
<s:head/> 
</head>
<body><h1>图书列表</h1>
<table border="1">
<tr><th>书名</th><th>isbn号</th><th>价格</th><th>作者</th></tr>
<s:iterator value="list">
<tr> 
<td><a href="viewDetails.action?bid=<s:property value="bid"/>">
<s:property value="title"/></a></td>
<td><s:property value="isbn"/></td>
<td><s:property value="price"/></td>
<td><s:property value="author"/></td>
</tr>


</s:iterator>
</table>
</body>
</html>
