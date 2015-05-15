package com.scxh.java.ex018.collection.queue.ex01;

public class ArrayQueue {
	private Student[] list = new Student[3];
	private int i = -1;
	private int j = -1;

	/**
	 * 从队尾添加数据
	 */
	public void add(Student student) {
		++i;
		if (i < list.length) {
			list[i] = student;
		} else {
			System.out.println("队列已满");
		}
	}

	/**
	 * 从队头获取元素
	 */
	public Student get() {
		Student student = null;
		++j;
		if(j < list.length){
			student = list[j];
		}
		return student;
		
	}

	/**
	 * 返回队列大小
	 * 
	 * @return
	 */
	public int size() {
		return list.length;
	}

	/**
	 * 清空队列
	 */
	public void clear() {
		for (int i = 0; i < list.length; i++) {
			list[i] = null;
		}
	}
}
