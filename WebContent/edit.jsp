<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="LightSalmon">	
<center>
			<s:form action="update">	
				<s:hidden key="user.userId"></s:hidden>
				<s:textfield label="Enter your name" key="user.uname" /><br>
				<s:password label="Enter your password" key="user.upass"/><br>
				<s:textfield label="Enter your address" key="user.uaddress"/><br>
				<s:textfield label="Enter your phone" key="user.uphone"/><br>
					<%-- <s:submit  /> --%>
					<!-- <a href="report"><button class="button-report" type="button">Report</button></a> -->
					
					
					<s:a  href="report"><button class="button-report" type="submit">UPDATE</button>  </s:a>
		</s:form>
		</center>
							
</body>
</html>