package com.geaks.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	
	   private DBConnection() {}
		private static Connection con=null;
		public static Connection getConnection() {
			try {
				if(con==null) {
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/struts","root","");
					
				}
			}catch(Exception e){
				e.printStackTrace();
			}
			return con;
}
}
