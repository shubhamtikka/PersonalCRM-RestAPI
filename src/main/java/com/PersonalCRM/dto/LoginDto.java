package com.PersonalCRM.dto;

public class LoginDto {
	
	int userId;
	int password;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "LoginDto [userId=" + userId + ", password=" + password + "]";
	}
	
}
