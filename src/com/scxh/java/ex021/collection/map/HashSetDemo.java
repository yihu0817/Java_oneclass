package com.scxh.java.ex021.collection.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSetDemo setDemo = new HashSetDemo();

		// setDemo.testHashMapPutAndGet();
		//		
		// setDemo.testHashSetAddAndIsEmpty();
		//	
		// setDemo.testHashSetcontains();

		// setDemo.testIterator();
//		setDemo.testHashMapSwitchSet();
		setDemo.testArrayListIterator();
	}

	
	/**
	 * HashMap保存与获取数据
	 */
	public void testHashMapPutAndGet() {
		Student stuA = new Student("张三",1);
		Student stuB = new Student("李四",2);
		Student stuC = new Student("王二",3);
		Student stuD = new Student("麻子",4);

		HashMap<String, Student> map = new HashMap<String, Student>();
		map.put("张三", stuA);
		map.put("李四", stuB);
		map.put("王二", stuC);
		map.put("麻子", stuD);

		Student stu = map.get("李四");

		String name = stu.getName();

		System.out.println("姓名 :" + name);
	}

	/**
	 * HashSet 保存数据，测试Set是否为空,不能添加重复数据
	 */
	public void testHashSetAddAndIsEmpty() {
		Student stuA = new Student("张三",1);
		Student stuB = new Student("李四",2);
		Student stuC = new Student("王二",3);
		Student stuD = new Student("麻子",4);

		HashSet<Student> sets = new HashSet<Student>();

		boolean isEmpty = sets.isEmpty();
		String result = isEmpty ? "没有数据" : "有数据";
		System.out.println(result);

		sets.add(stuA);
		sets.add(stuB);
		sets.add(stuC);
		sets.add(stuD);
		System.out.println("set数据个数 前 :" + sets.size());
		sets.add(stuD);// 不能添加重复数据
		System.out.println("set数据个数 后:" + sets.size());

		boolean isEmptys = sets.isEmpty();
		String results = isEmptys ? "没有数据" : "有数据";
		System.out.println(results);

	}

	/**
	 * HashSet contains方法和Clear方法学习
	 */
	public void testHashSetcontains() {

		HashSet<Student> sets = new HashSet<Student>();

		Student stuA = new Student("张三",1);
		Student stuB = new Student("李四",2);
		Student stuC = new Student("王二",3);
		Student stuD = new Student("麻子",4);

		sets.add(stuA);
		sets.add(stuB);

		boolean flag = sets.contains(stuB);
		if (flag) {
			System.out.println("对象存在Set中");
		} else {
			System.out.println("对象不存在Set中");
		}

		sets.clear();

		boolean flags = sets.contains(stuB);
		if (flags) {
			System.out.println("对象存在Set中");
		} else {
			System.out.println("对象不存在Set中");
		}

	}

	/**
	 * 遍历HashSet，迭代器Iterator使用
	 */
	public void testIterator() {
		Student stuA = new Student("张三",1);
		Student stuB = new Student("李四",2);
		Student stuC = new Student("王二",3);
		Student stuD = new Student("麻子",4);

		HashSet<Student> sets = new HashSet<Student>();
		sets.add(stuA);
		sets.add(stuB);
		sets.add(stuC);
		sets.add(stuD);

		Iterator<Student> iterator = sets.iterator();

		while (iterator.hasNext()) {
			Student stu = iterator.next();
			String name = stu.getName();
			System.out.println("姓名 :" + name);
			if (name.equals("李四")) {
				iterator.remove();
			}
		}

		iterator = sets.iterator();

		System.out.println(iterator.hasNext() ? "有数据" : "无数据");

		while (iterator.hasNext()) {
			Student stu = iterator.next();
			String name = stu.getName();

			System.out.println("姓名111 :" + name);
		}
	}

	/**
	 * 遍历HashMap,迭代器Iterator使用
	 */
	public void testHashMapSwitchSet() {
		Student stuA = new Student("张三",1);
		Student stuB = new Student("李四",2);
		Student stuC = new Student("王二",3);
		Student stuD = new Student("麻子",4);

		HashMap<String, Student> map = new HashMap<String, Student>();
		map.put("张三", stuA);
		map.put("李四", stuB);
		map.put("王二", stuC);
		map.put("麻子", stuD);

		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			Student stu = map.get(key);
			String name = stu.getName();
			System.out.println("姓名 :" + name);
		}
	}

	public void testArrayListIterator() {
		Student stuA = new Student("张三",1);
		Student stuB = new Student("李四",9);
		Student stuC = new Student("王二",8);
		Student stuD = new Student("麻子",4);

		List<Student> list = new ArrayList<Student>();
		list.add(stuA);
		list.add(stuB);
		list.add(stuC);
		list.add(stuD);

		//===============for 遍历================
		int count = list.size();
		for (int i = 0; i < count; i++) {
			Student stu = list.get(i);
			String name = stu.getName();
			System.out.println("for 遍历 姓名 :" + name);
		}

		//===============================
		
		
		Collections.sort(list, new Comparator<Student>() {
			public int compare(Student arg0, Student arg1) {
				//根据学号Num进行比较
				return arg0.getNum().compareTo(arg1.getNum());
				
//				if(arg0.getNum()>arg1.getNum()){
//					return 1;
//				}else{
//					return 0;
//				}
			}
		});

		
		//===============Iterator 遍历================
		Iterator<Student> iterator = list.iterator();

		while (iterator.hasNext()) {
			Student stu = iterator.next();
			String name = stu.getName();
			System.out.println("Iterator 遍历  姓名 :" + name);
		}
	}

}
