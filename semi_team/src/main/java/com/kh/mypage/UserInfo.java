package com.kh.mypage;

public class UserInfo {
	private String user_id;
	private String user_name;
	private String user_nickname;
	private String user_password;
	private String email;
	private String phone_number;
	
//	public UserInfo(String userNickname, String userId) {
//		this.user_id = user_id;
//		
//		this.user_nickname = user_nickname;
//		
//	}
	
	public UserInfo(String user_id,String user_name, String user_nickname, String user_password, String email, String phone_number) {
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_nickname = user_nickname;
		this.user_password = user_password;
		this.email = email;
		this.phone_number = phone_number;
	}
	
//	
	public String getUserId() {
		return user_id;
	}
	public void setUserId(String user_id) {
		this.user_id = user_id;
	}
	public String getUserName() {
		return user_name;
	}
	public void setUserName(String user_name) {
		this.user_name = user_name;
	}
	public String getUserNickname() {
		return user_nickname;
	}
	public void setUserNickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}
	public String getUserPassword() {
		return user_password;
	}
	public void setUserPassword(String user_password) {
		this.user_password = user_password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phone_number;
	}
	public void setPhoneNumber(String phone_number) {
		this.phone_number = phone_number;
	}
	
	
}
