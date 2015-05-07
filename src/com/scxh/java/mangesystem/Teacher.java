package com.scxh.java.mangesystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Teacher {
	public String name; // 姓名
	public String id; // 账号
	public int passWord; // 密码

	public ArrayList<Teacher> mList = new ArrayList<Teacher>(); // 存储注册教师信息

	public Teacher() {

	}

	public Teacher(String name, String id, int passWord) {
		this.name = name;
		this.id = id;
		this.passWord = passWord;
	}

	/**
	 * 注册
	 */
	public void register() {
		Scanner scaner = new Scanner(System.in);
		System.out.println("请输入姓名:");
		String name = scaner.next();
		System.out.println("请输入账号");
		String id = scaner.next();
		System.out.println("请输入密码:");
		int passWord = scaner.nextInt();

		Teacher teacher = new Teacher(name, id, passWord);
		mList.add(teacher);

		System.out.println("用户 " + teacher.name + "注册成功,账号是" + teacher.id
				+ ",密码是" + teacher.passWord);
	}

	/**
	 * 登录
	 */
	public void login() {
		Scanner scaner = new Scanner(System.in);
		System.out.println("请输入登录账号");
		String id = scaner.next();
		System.out.println("请输入登录密码:");
		int passWord = scaner.nextInt();

		boolean flag = check(id,passWord);
		if (flag) {
			System.out.println("登录成功！");
		}else{
			System.out.println("您输入的账号错误,请重新输入！");
			login();
		}

	}

	/**
	 * 遍历查找是否存在当前登录输入的账号
	 * 
	 * @return
	 */
	public boolean check(String id, int passWord) {
		boolean flag = false;// 如果为true表示没有找到，false表示找到
	
		int count = mList.size();  //获取ArrayList集合对象mList中元素个数
		for (int i = 0; i < count; i++) {
			Teacher teacher = mList.get(i);
			
			if (id.equals(teacher.id) && passWord == teacher.passWord) {
				flag = true;
				break;
			}
		}
		
//		for(Teacher teacher : mList){
//			if (id.equals(teacher.id) && passWord == teacher.passWord) {
//				flag = true;
//				break;
//			}
//		}
		
		return flag;
	}
}
