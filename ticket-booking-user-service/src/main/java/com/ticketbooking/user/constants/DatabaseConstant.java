package com.ticketbooking.user.constants;

public class DatabaseConstant {
	
	public static enum UserStatus {
		ACTIVE(1),
		NOT_ACTIVE(0);
		
		private int status;

	    private UserStatus(int status) {
	      this.status = status;
	    }

	    public int value() {
	      return this.status;
	    }
	     
	}
	
	public static enum UserRole {
		ADMIN("admin"),
		CUSTOMER("customer");
		
		private String role;

	    private UserRole(String role) {
	      this.role = role;
	    }

	    public String value() {
	      return this.role;
	    }
	     
	}

}
