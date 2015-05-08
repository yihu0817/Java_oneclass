package com.scxh.java.ex009.classs.cover;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		People obj = new Teacher("李老师");//将变量定义为父类的类型，却引用子类的对象，这个过程就是向上转型
		obj.say();
		
		Teacher obj1 = (Teacher)obj; //将向上转型后的子类对象再转成子类，调用子类的方法，这就是向下转型。
		obj1.show();
		if(obj1 instanceof People){
			System.out.println("我是人类");
		}
		if(obj1 instanceof Teacher){
			System.out.println("我是老师");
		}
	}

}







