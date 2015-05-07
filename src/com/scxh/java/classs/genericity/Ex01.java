package com.scxh.java.classs.genericity;

import java.util.ArrayList;

import com.scxh.java.classs.Mobile;
import com.scxh.java.classs.ex02.Student;


public class Ex01 {

	public void save() {
		ArrayList list = new ArrayList();
		Student stuA = new Student();
		Student stuB = new Student();

		list.add(stuA);
		list.add(stuB);
		//=======================
		Mobile mobA = new Mobile();
		Mobile mobB = new Mobile();
		
		ArrayList<Mobile> mList = new ArrayList<Mobile>();
		mList.add(mobA);
		mList.add(mobB);
	}
}
