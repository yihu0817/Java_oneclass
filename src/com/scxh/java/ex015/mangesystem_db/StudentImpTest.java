package com.scxh.java.ex015.mangesystem_db;

import java.util.Scanner;

public class StudentImpTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StudentImp studentImp = new StudentImp();

		System.out
				.println("====欢迎进入学生管理系统！====== \n 1  添加学生,2 显示学生列表,3 删除学生,4 查找学生,5  退出");

		Scanner scaner = new Scanner(System.in);

		for (int i = 0;; i++) {
			System.out.println("[输入操作命令]:");
			int command = scaner.nextInt();
			switch (command) {
			case 1:
				studentImp.addStudent();
				break;
			case 2:
				studentImp.showAllStudent();
				break;
			case 3:
				studentImp.deleteStudent();
				break;
			case 4:
				studentImp.findStudentByNumber();
				break;
			case 5:
				studentImp.exit();
				break;
			}
		}

	}

}
