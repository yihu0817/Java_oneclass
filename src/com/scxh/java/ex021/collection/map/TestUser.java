package com.scxh.java.ex021.collection.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestUser {
	public static void main(String[] args) {

		User user1 = new User("张三",103);

		User user2 = new User("李四",102);
		
		User user3 = new User("麻子",105);

		List<User> list = new ArrayList<User>();
		list.add(user1);
		list.add(user2);
		list.add(user3);
		
		Collections.sort(list);

		for (User u : list) {

			System.out.println(u.getName());

		}

	}
}
