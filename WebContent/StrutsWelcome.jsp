<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<center>
			<h1><b>Student Login Form</b></h1>
			<s:form action="getlogins">
				<s:textfield label="Enter your name "  name="uname"></s:textfield>
				<s:textfield label="Enter your pass "  name="upass"></s:textfield>
				<s:submit value="submit"></s:submit>
				<s:submit value="reset"></s:submit>
					
		</s:form>
		<a href="RegistrationForm.jsp">New User</a>
		</center>
</body>
</html>