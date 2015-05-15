package com.scxh.java.ex021.collection.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestUser {
	public static void main(String[] args) {

		User user1 = new User("a",1);

		User user2 = new User("b",2);

		List<User> list = new ArrayList<User>();

		// ¥À¥¶add user2‘Ÿadd user1

		list.add(user2);

		list.add(user1);

		Collections.sort(list);

		for (User u : list) {

			System.out.println(u.getName());

		}

	}
}
