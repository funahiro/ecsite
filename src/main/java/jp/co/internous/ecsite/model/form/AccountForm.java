package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

public class AccountForm implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String password;
	private String fullName;
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
