<%@ page language="java" pageEncoding="gb2312"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<!-- struts2��ǩ��������� -->
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>ע��ҳ��</title>
	<s:head/>
</head>
<body>
	<!-- �û���¼�� -->
	<!-- validate="true"��ʾ�ͻ���У�� -->
	<h1>�û���¼</h1>
	<s:label></s:label>
	<s:form action="login.action"  validate="true">
	
		<table width="40%" height="76" border="0">
				<!-- ����ǩ���� -->
				<s:textfield name="username" label="�û���"/>
				<s:password name="password" label="��  ��" />
				<s:submit value="��¼" align="center"/>				
		</table>
	</s:form>
</body>
</html>
