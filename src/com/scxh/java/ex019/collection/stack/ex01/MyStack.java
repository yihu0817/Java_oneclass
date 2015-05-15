package com.scxh.java.ex019.collection.stack.ex01;

import java.util.Stack;

import com.scxh.java.ex018.collection.queue.ex01.Student;

@SuppressWarnings("serial")
public class MyStack extends Stack<Student> {
	/**
	 * Ñ¹Õ»
	 * 
	 * @param item
	 */
	public void doPush(Student item) {
		push(item);
	}

	/**
	 * µ¯Õ»
	 * 
	 * @return
	 */
	public Student doPop() {
		Student item = (Student) pop();
		return item;
	}
}
