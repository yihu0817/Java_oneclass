package com.scxh.java.ex030.data.connects;

public class User {
	private String id;

	private String userName;

	private String passWord;

	private String userType;

	private String regdatetime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getRegdatetime() {
		return regdatetime;
	}

	public void setRegdatetime(String regdatetime) {
		this.regdatetime = regdatetime;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	
}
