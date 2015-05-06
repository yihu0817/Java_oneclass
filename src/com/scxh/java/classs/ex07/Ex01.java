package com.scxh.java.classs.ex07;

import java.util.ArrayList;

public class Ex01 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		People[] array = new People[10];
		
		People obj1 = new People();
		obj1.name="张三";
		array[0] = obj1;
		
		People obj2 = new People();
		obj2.name="李四";
		
		array[1] = obj2;
		
		ArrayList list = new ArrayList();//动态数组
		list.add(obj1);
		list.add(obj2);
		
		People obj = (People)list.get(0);
		obj.say();
		
		list.remove(1);
		
		list.remove(obj1);
		
		if(list.contains(obj2)){
			
		}
		list.size();

		
		
	}
}
