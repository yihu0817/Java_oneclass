package com.scxh.java.queue.ex01;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//=====================================
		Student stuA = new Student("张三");
		Student stuB = new Student("李四");
		Student stuC = new Student("王二");
		Student stuD = new Student("麻子");
		
//		MyQueue queue = new MyQueue();
		
		ArrayQueue queue = new ArrayQueue();
		queue.add(stuA);
		queue.add(stuB);
		queue.add(stuC);
		queue.add(stuD);
		
		Student stu1 = queue.get();
		System.out.println("从队列取出数据 "+stu1.getName());
		//======================================
		
		
	}

}
