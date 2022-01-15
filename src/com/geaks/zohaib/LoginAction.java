package com.geaks.zohaib;

import java.sql.Connection;
import java.sql.SQLException;

import com.geaks.connection.DBConnection;
import com.geaks.zohaib.model.User;
import com.geaks.zohaib.service.LoginService;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction implements ModelDriven<User> {
	
	 static Connection con=DBConnection.getConnection();
	 

	 
	 
	private User user=new User();
	
	public String userLogin() throws SQLException
	{
		
		System.out.println();
		if(LoginService.loginUser(user)>0)
		{
			return "welcomePage";
		}else
		{
			return "errorPage";
		}
	}
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	
	
}
