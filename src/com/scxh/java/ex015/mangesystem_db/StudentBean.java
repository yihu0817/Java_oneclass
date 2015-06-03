package com.scxh.java.ex015.mangesystem_db;

public class StudentBean {
	private String name; // ĞÕÃû
	private String number; // Ñ§ºÅ

	public StudentBean(){
		
	}
	
	public StudentBean(String name,String number){
		this.name = name;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}
