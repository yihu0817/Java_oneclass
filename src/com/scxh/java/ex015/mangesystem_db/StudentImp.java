package com.scxh.java.ex015.mangesystem_db;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentImp {
	private StudentDB mDB = StudentDB.getInstance();
	/**
	 * 添加学生
	 */
	public void addStudent() {
		System.out.println("======添加学生信息操作=========");
		Scanner scaner = new Scanner(System.in);
		System.out.println("请输入姓名:");
		String name = scaner.next();
		System.out.println("请输入学号:");
		String number = scaner.next();

		boolean isStudent = mDB.selectStudent(number);
		
		if(!isStudent ){
			StudentBean student = new StudentBean(name, number);
			mDB.addStudent(student);

			System.out.println("======添加成功 ! 学生姓名是 :" + student.getName() + ",学号是 : "
					+ student.getNumber()+"=========");
		}else{
			System.out.println("您输入学号已经存在，请重新输入！");
		}
		
	}

	/**
	 * 删除学生
	 */
	public void deleteStudent() {
		System.out.println("======删除学生信息操作=========");
		Scanner scaner = new Scanner(System.in);
		System.out.println("请输入学号:");
		String number = scaner.next();

		boolean isStudent = mDB.selectStudentByNumber(number);
		if (!isStudent) {
			System.out.println("您输入的学号为" + number + "的学生不存在!");
		} else {
			mDB.deleteStudentBean(number);
			System.out.println("====删除学生成功!学号是:" + number + "的学生已从学生管理系统中删除====");
		}
	}


	/**
	 * 根据学号查找学生
	 */
	public void findStudentByNumber() {
		System.out.println("======查找学生信息操作=========");
		Scanner scaner = new Scanner(System.in);
		System.out.println("请输入学号:");
		String number = scaner.next();

		
		boolean isStudent = mDB.selectStudentByNumber(number);
		
		if (!isStudent) {
			System.out.println("您查找的学号为" + number + "的学生不存在!");
		} else {
			StudentBean student = mDB.seleStudentBeans(number);
			System.out.println("===您查找的学生是  "+student.getName()+"====");
		}
	}

	/**
	 * 显示所有学生
	 */
	public void showAllStudent() {
		System.out.println("姓名 "+" \t"+ " 学号");
		ArrayList<StudentBean> list = mDB.selectAllStudent();
		for(StudentBean students : list){
			System.out.println(students.getName()+"\t"+students.getNumber());
		}
	}

	/**
	 * 退出学生管理系统
	 */
	public void exit() {
		System.out.println("====您已经退出学生管理系统====");
		System.exit(0);
		
	}
}
