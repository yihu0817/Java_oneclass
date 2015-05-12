package com.scxh.java.queue.ex01;

import java.util.LinkedList;

/**
 * 自定义队列
 * 
 * @author viktor
 * 
 */
public class MyQueue {
	private LinkedList<Student> list = new LinkedList<Student>();

	/**
	 * 从队尾添加数据
	 */
	public void add(Student student) {
		list.addLast(student);
	}

	/**
	 * 从队头获取元素
	 */
	public Student get() {
		Student student = list.getFirst();
		return student;
	}

	/**
	 * 返回队列大小
	 * 
	 * @return
	 */
	public int size() {
		return list.size();
	}

	/**
	 * 清空队列
	 */
	public void clear() {
		list.clear();
	}
}
