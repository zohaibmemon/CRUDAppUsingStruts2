package com.geaks.zohaib.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.geaks.connection.DBConnection;
import com.geaks.zohaib.model.User;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class BusinessService {
	 static Connection con=DBConnection.getConnection();
	
	 
	 public static Integer addUser(User user) throws SQLException
	    {
	        
	        int r=0;
	       // String sql="INSERT INTO registration values(?,?,?,?)";
	        PreparedStatement pst=con.prepareStatement("INSERT INTO registration(uName,uPass,uAddress,uPhone) values(?,?,?,?)");
		      pst.setString(1, user.getUname());
		      pst.setString(2, user.getUpass());
		      pst.setString(3, user.getUaddress());
		      pst.setString(4, user.getUphone());
		      r=pst.executeUpdate();
		      
	       System.out.println(r);
	        
	        return r;
	       
	        
	    }
	 public static Integer updateUser(User user) throws SQLException
	 {
		 int r=0;
		 String sql="update registration set uName=? ,uPass=?, uAddress=? ,uPhone=? where id=?";
		 PreparedStatement pst=con.prepareStatement(sql);
		 pst.setString(1, user.getUname());
		 pst.setString(2, user.getUpass());
		 pst.setString(3, user.getUaddress());
		 pst.setString(4, user.getUphone());
		 pst.setInt(5, user.getUserId());
		 r=pst.executeUpdate();
		 return r;
		 
	 }
	 public static User getUserById(int user2) throws SQLException
	 {
		 User user = new User();
		 String sql="select * from registration where id=?";
		 PreparedStatement pst=con.prepareStatement(sql);
		 pst.setInt(1, user2);
		 java.sql.ResultSet rst=pst.executeQuery();
		
			while(rst.next()) {
				
				user.setUserId(rst.getInt("id"));
				user.setUname(rst.getString("uName"));
				user.setUpass(rst.getString("uPass"));
				user.setUaddress(rst.getString("uAddress"));
				user.setUphone(rst.getString("uPhone"));
				
				
			}
			return user; 
			
	 }
	 
		 /* while(rs.next())
		 {
			 
			user=rs.getInt(1);
			
		 }*/
		
	 
	 
	/*   public Integer getIdByProduct(ProductBean productBean) {
	        int r=0;
	        try {
	            PreparedStatement ps = con.prepareStatement("select * from product where product_name=?");
	            ps.setString(1, productBean.getProductName());
	            ResultSet rst = ps.executeQuery();
	            while (rst.next()) {
	                r = rst.getInt(1);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return r;
	    }*/
	 
	 public static Integer deleteUser(Integer id) throws SQLException
	 {
		 int r=0;
		 String sql="delete from  registration where id=?";
		 PreparedStatement pst=con.prepareStatement(sql);
		 pst.setInt(1, id);
		 r=pst.executeUpdate();
		 System.out.println(r);
		 return r;
	 }
	 
	 
		/*public static User report(User user) throws SQLException, Exception {
			ResultSet rs = null;
			
				String sql = "SELECT id,uName,uPass,uAddress,uPhone FROM registration";
				PreparedStatement ps = con.prepareStatement(sql);
				rs = (ResultSet) ps.executeQuery();
				while(rs.next())
				{
					
					user.setUname(rs.getString("uName"));
					user.setUpass(rs.getString("uPass"));
					user.setUaddress(rs.getString("uAddress"));
					user.setUphone("uPhone");
					user.setUserId(Integer.parseInt(rs.getString("id")));
				}
				return user;
			
		}*/
		
		public static List<User> viewReport(){
			List<User> userbeans = new ArrayList<>();
			
			try {
				PreparedStatement pst = con.prepareStatement("select * from registration");
				ResultSet rst = (ResultSet) pst.executeQuery();
				
				while(rst.next()) {
					User user = new User();
					user.setUserId(rst.getInt("id"));
					user.setUname(rst.getString("uName"));
					user.setUpass(rst.getString("uPass"));
					user.setUaddress(rst.getString("uAddress"));
					user.setUphone(rst.getString("uPhone"));
					
						userbeans.add(user);
									}
			}catch(Exception e) {}
			return userbeans;
		}
	/* public boolean verifyLogin(User user)
	{
		
		
		
		
		if(user.getUname().equals("zohaib") && user.getUpass().equals("memon") && user.getUaddress().equals("karachi") && user.getUphone().equals("72"))
		{
		
			return true;
		}
		return false;
		*/
		
	
}
