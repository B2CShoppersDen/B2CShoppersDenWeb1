package com.b2cshoppersden.model;

public class AdminLoginModel {

	private int adminId;
	private String adminUserName;
	private String password;
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminUserName() {
		return adminUserName;
	}
	public void setAdminUserName(String adminUserName) {
		this.adminUserName = adminUserName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}		
	@Override
	public String toString() {
		return "AdminLoginModel [adminId=" + adminId + ", adminUserName=" + adminUserName + ", password=" + password
				+ "]";
	}
	
	
}
