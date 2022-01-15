package com.geaks.zohaib.model;

public class User {

	
		private Integer userId;
		private String uname;
		private String upass;
		private String uaddress;
		private String uphone;
		
		public User(){
			
		}
		
		
		public User(Integer userId, String uname, String upass, String uaddress, String uphone) {
			super();
			this.userId = userId;
			this.uname = uname;
			this.upass = upass;
			this.uaddress = uaddress;
			this.uphone = uphone;
		}
		public Integer getUserId() {
			return userId;
		}
		public void setUserId(Integer userId) {
			this.userId = userId;
		}
		public String getUname() {
			return uname;
		}
		public void setUname(String uname) {
			this.uname = uname;
		}
		public String getUpass() {
			return upass;
		}
		public void setUpass(String upass) {
			this.upass = upass;
		}
		public String getUaddress() {
			return uaddress;
		}
		public void setUaddress(String uaddress) {
			this.uaddress = uaddress;
		}
		public String getUphone() {
			return uphone;
		}
		public void setUphone(String uphone) {
			this.uphone = uphone;
		}
			
		
		@Override
		public String toString() {
			return "User [userId=" + userId + ", uname=" + uname + ", upass=" + upass + ", uaddress=" + uaddress
					+ ", uphone=" + uphone + "]";
		}	
			
					
		
		

}
