package com.scxh.java.ex020.arraylist;

import java.util.ArrayList;
import java.util.HashMap;

import com.scxh.java.ex018.queue.ex01.Student;

public class HashMapDemo {
	ArrayList<Student> list = new ArrayList<Student>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMapDemo demo = new HashMapDemo();
		
		demo.addStudentToArryList();

		Student stu = demo.findStudentByName("小明");

		if (stu == null) {
			System.out.println("没有找到你想要的人");
		} else {
			System.out.println("姓名 :" + stu.getName());
		}
		
		demo.testHashMapAddAndFind();
	}

	/**
	 * 添加学生到ArrayList
	 */
	public void addStudentToArryList() {
		Student stuA = new Student("张三");
		Student stuB = new Student("李四");
		Student stuC = new Student("王二");
		Student stuD = new Student("麻子");

		list.add(stuA);
		list.add(stuB);
		list.add(stuC);
		list.add(stuD);

	}

	/**
	 * 通过姓名查找学生对象
	 */
	public Student findStudentByName(String stuName) {
		int count = list.size();
		Student student = null;
		for (int i = 0; i < count; i++) {
			Student stu = list.get(i);
			String name = stu.getName();
			if (stuName.equals(name)) {
				student = stu;
				break;
			}

		}

		return student;
	}
	
	public void testHashMapAddAndFind(){
		Student stuA = new Student("张三");
		Student stuB = new Student("李四");
		Student stuC = new Student("王二");
		Student stuD = new Student("麻子");
		
		HashMap<String, Student> map = new HashMap<String, Student>();
		map.put("张三", stuA);
		map.put("李四", stuB);
		map.put("王二", stuC);
		map.put("麻子", stuD);
		
		Student stu = map.get("李四");
		System.out.println("姓名 :"+stu.getName());
	}

}
