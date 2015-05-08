package com.scxh.java.ex012.classs.innerclass.anonymity;
/**
 * 匿名内部类使用
 * @author viktor
 *
 */
public class Demo {

	public static void main(String[] args) {
//		 Person person = new Child();
//		 person.eat();

		new Person() {

			@Override
			public void eat() {
				System.out.println("吃东西！");
			}
		}.eat();

	}

//	public class Child extends Person {
//
//		@Override
//		public void eat() {
//			System.out.println("吃东西");
//
//		}
//
//	}

}
