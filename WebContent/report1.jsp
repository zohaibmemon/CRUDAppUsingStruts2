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
			<h1>Struts 2 Create, Read, Update and Delete (CRUD) Example using JDBC</h1>

	
			<table bgcolor="LightSalmon">
				<thead>
					<tr style="background-color: #E0E0E1;">
						<th>Sr.No.</th>
						<th>Name</th>
						<th>Email</th>
						<th>Password</th>
						<th>Designation</th>
						<th>Action</th>
					</tr>
				</thead>
				
				<s:iterator value="beanList">
					<tr>
						<td><s:property value="userId" /></td>
						<td><s:property value="uname" /></td>
						<td><s:property value="upass" /></td>
						<td><s:property value="uaddress" /></td>
						<td><s:property value="uphone" /></td>
						<td>
							<a href="edit.action?id=<s:property value="userId"/>">
								<button class="button-update">update</button>
							</a>
							
							
							<a href="delete.action?id=<s:property value="userId"/>">
								<button class="button-delete">Delete</button>
							</a>
						</td>  
					</tr>
				</s:iterator>
			</table>
		
		<s:else>
			<div style="color: red;">No Data Found.</div>
		</s:else>
		</center>
		</body>
	</html>
		
	
	