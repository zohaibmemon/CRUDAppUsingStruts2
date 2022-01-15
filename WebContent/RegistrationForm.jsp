<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body  bgcolor="DarkSalmon">
	<center>
					<h2>Struts 2 Create, Read, Update and Delete (CRUD) Example using JDBC</h2>
	<a href="report"><button class="button-report" type="button">Report</button></a>
		<s:form action="add" >	
			
				<s:textfield label="Enter your name" key="uname"/><br>
				<s:password label="Enter your password" key="upass"/><br>
				<s:textfield label="Enter your address" key="uaddress"/><br>
				<s:textfield label="Enter your phone" key="uphone"/><br>
				<%-- <s:submit  /> --%>
				<s:a  href="report"><button class="button-report" type="submit">Add</button>  </s:a>
		</s:form>
</center>
</body>
</html>