package com.scxh.java.ex029.data.connect;

public class TestDB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("王二");
		student.setNumber(1005);
		student.setPassWord("abcd");
		student.setAge("13岁");
		student.setSex("男");

		DBUtil db = new DBUtil();
		db.connectDB();
		
//		db.addStudent(student);
		db.inSertStudent(student);
		db.selectStudent();
		
		
//		Student studentA = new Student();
//		studentA.setName("张三");
//		studentA.setNumber(2001);
//		db.updateStudentById(studentA, 29);
//		
//		db.selectStudent();
		
		db.closeDB();
	}

}
