package com.geaks.zohaib.service;

import java.sql.Connection;
import java.sql.SQLException;

import com.geaks.connection.DBConnection;
import com.geaks.zohaib.model.User;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.opensymphony.xwork2.ModelDriven;

public class LoginService {

	
	 static Connection con=DBConnection.getConnection();
		public User user;
		
		public static Integer loginUser(User user) throws SQLException
		{
			int r=0;
				java.sql.PreparedStatement pst=null;
				String sql="select   from registration where uName=?,uPass=?,uAddress=?,uPhone=? where id=?";
				pst=con.prepareStatement(sql);
				pst.setString(1, user.getUname());
				pst.setString(2, user.getUpass());
				pst.setString(3, user.getUaddress());
				pst.setString(4, user.getUphone());
				pst.setInt(5, user.getUserId());
				java.sql.ResultSet rs=pst.executeQuery();
			
				
				while(rs.next())
				{
					user.setUname(rs.getString("uName"));
					user.setUpass(rs.getString("uPass"));
					user.setUaddress(rs.getString("uAddress"));
					user.setUphone(rs.getString("uPhone"));
//					user = new User(rs.getInt("id"), rs.getString("uName"), rs.getString("uPass"), rs.getString("uAddress"), rs.getString("uPhone"));
					
				}
				return r;
		}

	
}
