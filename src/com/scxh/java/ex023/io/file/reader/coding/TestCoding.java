package com.scxh.java.ex023.io.file.reader.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.scxh.java.ex029.data.connect.DBUtil;
import com.scxh.java.ex029.data.connect.Student;

public class TestCoding {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		String encoding = System.getProperty("file.encoding");
		System.out.println(encoding);

		DBUtil db = DBUtil.getInstance();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		System.out.println("ÇëÊäÈë :");
		String line = reader.readLine();
		while (!line.equals("end")) {
			System.out.println("ÄãÊäÈëµÄ×Ö·û :" + line);
		
			Student student = new Student();
			student.setName(line);
			student.setNumber(1007);
			student.setPassWord("abcd");
			student.setAge("13Ëê");
			student.setSex("ÄĞ");

			db.inSertStudent(student);
			
			line = reader.readLine();
		}
		

	}

}
