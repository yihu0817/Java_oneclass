package com.scxh.java.ex021.collection.map;

public class Student {
	private String name;
	private Integer num;

	public Student(String name,int num) {
		this.name = name;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}
}
