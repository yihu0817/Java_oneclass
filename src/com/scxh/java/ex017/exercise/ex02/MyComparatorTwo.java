package com.scxh.java.ex017.exercise.ex02;

import java.util.Comparator;

public class MyComparatorTwo implements Comparator<Student>{

	public int compare(Student o1, Student o2) {
		int num1 = o1.getNumber();
		int num2 = o2.getNumber();
		
		return num1 > num2 ? 1:-1;
	}
	
}
