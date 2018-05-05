<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>checkbox Tag Example</title>
<style type="text/css">@import url(css/main.css);</style>
<style type="text/css">
.errorMessage{
	color:red;
}
</style>
</head>

<body>
<div id="global" style="width:300px">

<s:form action="check" validate="true">
	<s:textfield label="用户名" name="username"></s:textfield>
	<s:password label="密码" name="password"></s:password>
	<s:password label="确认密码" name="password2"></s:password>
	<s:textfield label="邮件地址" name="email"></s:textfield>
	<s:submit label="确定"></s:submit>

</s:form>

</div>
</body>
</html>
