package com.scxh.java.ex017.exercise.ex02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class TestStudentSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		sortComparable();
		sortComparator();
		
	}
	public static void sortComparable(){
		Student stuA = new Student("小明",30);
		Student stuB = new Student("张三",42);
		Student stuC = new Student("王二",29);
		Student stuE = new Student("李四",29);
		Student stuD = new Student("大彬",18);
		
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(stuA);
		list.add(stuB);
		list.add(stuC);
		list.add(stuD);
		list.add(stuE);
		
		
		Iterator<Student> iterator = list.iterator();
		while(iterator.hasNext()){
			Student stu = iterator.next();
			String name = stu.getName();
			int number = stu.getNumber();
			System.out.println("姓名 :"+name+ " 学号 :"+number);
		}

		
		System.out.println("=========对容器中元素进行排序=使用Comparable===========");
		
		Collections.sort(list);
		
		
		iterator = list.iterator();
		while(iterator.hasNext()){
			Student stu = iterator.next();
			String name = stu.getName();
			int number = stu.getNumber();
			System.out.println("姓名 :"+name+ " 学号 :"+number);
		}
	}
	
	
	public static void sortComparator(){
		Student stuA = new Student("小明",30);
		Student stuB = new Student("张三",42);
		Student stuC = new Student("王二",29);
		Student stuE = new Student("李四",29);
		Student stuD = new Student("大彬",18);
		
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(stuA);
		list.add(stuB);
		list.add(stuC);
		list.add(stuD);
		list.add(stuE);
		
		
		showList(list);

		System.out.println("=========对容器中元素进行排序=使用Comparator===========");
		Collections.sort(list,new MyComparatorTwo());
		
		showList(list);
	}
	/**
	 * 遍历容器 
	 * @param list
	 */
	public static void showList(ArrayList list){
		Iterator<Student> iterator = list.iterator();
		while(iterator.hasNext()){
			Student stu = iterator.next();
			String name = stu.getName();
			int number = stu.getNumber();
			System.out.println("姓名 :"+name+ " 学号 :"+number);
		}
	}
	/**
	 * 排序实现方法汇总
	 * @param list
	 * @return
	 */
	public static ArrayList<Student> sortList(ArrayList<Student> list){
		//================方法一 ===匿名内部类================
		Collections.sort(list,new Comparator<Student>() {

			public int compare(Student o1, Student o2) {
				int num1 = o1.getNumber();
				int num2 = o2.getNumber();
				
				return num1 > num2 ? 1:-1;
			}
		});
		
		
		//================方法二 ===================
		Comparator<Student> comaprator = new Comparator<Student>() {

			public int compare(Student o1, Student o2) {
				int num1 = o1.getNumber();
				int num2 = o2.getNumber();
				
				return num1 > num2 ? 1:-1;
			}
		};
		
		Collections.sort(list,comaprator);
		
		
		//================= 方法三  ==内部类 MyComparator====================
		Collections.sort(list,new TestStudentSort().new MyComparator());
		
		
		
		//================= 方法四 ======================
		Collections.sort(list,new MyComparatorTwo());
		
		
		return list;
	}
	
	class MyComparator implements Comparator<Student>{

		public int compare(Student o1, Student o2) {
			int num1 = o1.getNumber();
			int num2 = o2.getNumber();
			
			return num1 > num2 ? 1:-1;
		}
		
	}

}
