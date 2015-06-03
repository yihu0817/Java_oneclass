package com.scxh.java.ex015.mangesystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	public String name; // 姓名
	public int number; // 学号

	public ArrayList<Student> mStudentList = new ArrayList<Student>();// 存储学生对象

	public Student() {

	}

	public Student(String name, int number) {
		this.name = name;
		this.number = number;
	}

	/**
	 * 添加学生
	 */
	public void addStudent() {
		System.out.println("======添加学生信息操作=========");
		Scanner scaner = new Scanner(System.in);
		System.out.println("请输入姓名:");
		String name = scaner.next();
		System.out.println("请输入学号:");
		int number = scaner.nextInt();

		Student stu = check(number);
		
		if(stu == null){
			Student student = new Student(name, number);
			mStudentList.add(student);

			System.out.println("======添加成功 ! 学生姓名是 :" + student.name + ",学号是 : "
					+ student.number+"=========");
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
		int number = scaner.nextInt();

		Student student = check(number);
		if (student == null) {
			System.out.println("您输入的学号为" + number + "的学生不存在!");
		} else {
			mStudentList.remove(student); // 从学生管理系统中删除指定的对象
			System.out.println("====删除学生成功!学号是:" + number + "的学生已从学生管理系统中删除====");
		}
	}

	/**
	 * 遍历学生管理系统（mStudentList）检查是否存在对应学号的学生
	 * 如果存在就返回对应学生
	 * 不存在返回null
	 * @param number
	 * @return
	 */
	public Student check(int number) {
		int count = mStudentList.size();// 获取添加学生总个数
		for (int i = 0; i < count; i++) {
			Student student = mStudentList.get(i);

			if (student.number == number) { // 如果为true表示找到要删除的学生
				return student;
			}
		}
		return null;
	}

	/**
	 * 根据学号查找学生
	 */
	public void findStudentByNumber() {
		System.out.println("======查找学生信息操作=========");
		Scanner scaner = new Scanner(System.in);
		System.out.println("请输入学号:");
		int number = scaner.nextInt();

		Student student = check(number);
		if (student == null) {
			System.out.println("您查找的学号为" + number + "的学生不存在!");
		} else {
			System.out.println("===您查找的学生是:" + student.name+"====");
		}
	}

	/**
	 * 显示所有学生
	 */
	public void showAllStudent() {
		int count = mStudentList.size();// 获取添加学生总个数
		System.out.println("姓名      学号");
		for (int i = 0; i < count; i++) {
			Student student = mStudentList.get(i);
			System.out.println(student.name+"     "+ student.number);
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
