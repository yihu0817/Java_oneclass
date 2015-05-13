package com.scxh.java.ex019.stack.ex01;

import java.util.Vector;

import com.scxh.java.ex018.queue.ex01.Student;
/**
 * 集合类
 * ArrayType[]
 * 
 * ArrayList
 * Vector
 * 
 * Stack
 * LinkedList implements Queue
 * 
 * @author viktor
 *
 */
public class VectorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student stuA = new Student("张三");
		Student stuB = new Student("李四");
		Student stuC = new Student("王二");
		Student stuD = new Student("麻子");
		
		Student[] stuArray = new Student[4];
		stuArray[0] = stuA;
		stuArray[1] = stuB;
		stuArray[2] = stuC;
		stuArray[3] = stuD;
		
		
		Vector<Student> vector = new Vector<Student>();
		vector.add(stuA);
		vector.add(stuB);
		vector.add(stuC);
		vector.add(stuD);
		
//		for(Student student : vector){
//			System.out.println(student.getName());
//		}
		
		int count = vector.size();
		for(int i = 0; i< count; i++){
			Student stu = vector.get(i);
			System.out.println(stu.getName());
		}

		
		

	}

}
