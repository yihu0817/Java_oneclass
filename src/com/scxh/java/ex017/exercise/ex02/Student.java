package com.scxh.java.ex017.exercise.ex02;

public class Student implements Comparable<Student> {
	private String name;
	private int number;

	public Student(String name, int number) {
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public int compareTo(Student o) {
		int newNumber = o.getNumber(); //指定比较的学生对象
		int currenNumber = this.number;   //当前对象
		return currenNumber > newNumber ? 1 : -1;
	}

}
