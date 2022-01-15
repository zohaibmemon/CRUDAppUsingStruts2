package com.geaks.zohaib;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;

import com.geaks.connection.DBConnection;
import com.geaks.zohaib.model.User;
import com.geaks.zohaib.service.BusinessService;

import com.opensymphony.xwork2.ModelDriven;

public class StrutsAction extends HttpServlet  implements ModelDriven<User> {

	//private static  String SUCCESS= "success";
	 static Connection con=DBConnection.getConnection();
	private User user=new User();
	List<User> beanList = null;
	private int id;
	
		public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
		public String addUser() throws SQLException
		{
			
			  if(BusinessService.addUser(user)>0)
			     {
				  beanList = new ArrayList<User>();
				   List<User> userBean = BusinessService.viewReport();
					System.out.println("id  "+" name"+" "+" pass"+" adddress"+"phone");
					System.out.println("--------------------------------");
					for(User ub:userBean) {   
						user=new User();
						 	user.setUname(ub.getUname());
						 	user.setUpass(ub.getUpass());
						 	user.setUaddress(ub.getUaddress());
						 	user.setUphone(ub.getUphone());
						 	user.setUserId(ub.getUserId());        
						 	beanList.add(user);
			     System.out.println("add Users success fully");
			    
			     }
			     } return "REPORT1";
			    /* else
			     {System.out.println("not added users successfully");
			    
			     return "input";*/
			     
			     }
			  
		
		public String deleteUser() throws SQLException
		{
//			 String user_id = request.getParameter("userId");//+getRecordIndex(request));
//			request.getParameter("text1"); 
			
			System.out.println();
			
		
			if(BusinessService.deleteUser(id)>0)
			{
				  beanList = new ArrayList<User>();
				   List<User> userBean = BusinessService.viewReport();
					System.out.println("id  "+" name"+" "+" pass"+" adddress"+"phone");
					System.out.println("--------------------------------");
					for(User ub:userBean) {
						user=new User();
						 	user.setUname(ub.getUname());
						 	user.setUpass(ub.getUpass());
						 	user.setUaddress(ub.getUaddress());
						 	user.setUphone(ub.getUphone());
						 	user.setUserId(ub.getUserId());        
						 	beanList.add(user);
			     System.out.println("add Users success fully");
			    
			     }
					
			}
			return "REPORT4";
			
		}
		public String EditUser() throws SQLException
		{

		//	System.out.println(id);
			
			 user=BusinessService.getUserById(id);
			System.out.println(user);
			
			
		//	if(BusinessService.updateUser(user)>0)
			//	{
				// System.out.println("update success fully");
			     return "REPORT2";
			    // }
			     //else
			     //{System.out.println("not update users successfully");
			    
			     //return "input";
			}
		public String updateUser() throws SQLException
		{
				
			if(BusinessService.updateUser(user)>0)
			{
				  beanList = new ArrayList<User>();
				   List<User> userBean = BusinessService.viewReport();
					System.out.println("id  "+" name"+" "+" pass"+" adddress"+"phone");
					System.out.println("--------------------------------");
					for(User ub:userBean) {
						user=new User();
						 	user.setUname(ub.getUname());
						 	user.setUpass(ub.getUpass());
						 	user.setUaddress(ub.getUaddress());
						 	user.setUphone(ub.getUphone());
						 	user.setUserId(ub.getUserId());        
						 	beanList.add(user);
						}
			
			}return "REPORT3";	
		}
			
		
		
	
		
		
		public String myReport()
		{
			beanList = new ArrayList<User>();
			   List<User> userBean = BusinessService.viewReport();
				System.out.println("id  "+" name"+" "+" pass"+" adddress"+"phone");
				System.out.println("--------------------------------");
				for(User ub:userBean) {
					user=new User();
					 	user.setUname(ub.getUname());
					 	user.setUpass(ub.getUpass());
					 	user.setUaddress(ub.getUaddress());
					 	user.setUphone(ub.getUphone());
					 	user.setUserId(ub.getUserId());        
					 	beanList.add(user);
				}
			
			return "REPORT";
		}
	public List<User> getBeanList() {
			return beanList;
		}
		public void setBeanList(List<User> beanList) {
			this.beanList = beanList;
		}
	public String getUsersById()
	{
		return "";
		
		
	}
		
		
   
	public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	

}
