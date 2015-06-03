package com.scxh.java.ex015.mangesystem_db;

import java.util.ArrayList;


public class StudentDBTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StudentBean student = new StudentBean("张三","1003");
		
		StudentDB db = StudentDB.getInstance();
//		db.addStudent(student);
		
//		db.updateStudentBean(student, "1001");

		
//		boolean result = db.selectStudent("张三");
//		if(result){
//			System.out.println("已存在！");
//		}else{
//			System.out.println(" 不存在！");
//		}
		
		
//		System.out.println("姓名 "+" \t"+ " 学号");
//		ArrayList<StudentBean> list = db.selectAllStudent();
//		for(StudentBean students : list){
//			System.out.println(students.getName()+"\t"+students.getNumber());
//		}
		
		db.deleteStudentBean("1003");
		
		
		System.out.println("姓名 "+" \t"+ " 学号");
		ArrayList<StudentBean> list = db.selectAllStudent();
		for(StudentBean students : list){
			System.out.println(students.getName()+"\t"+students.getNumber());
		}
		
	}

}
