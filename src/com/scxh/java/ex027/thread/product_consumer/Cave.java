package com.scxh.java.ex027.thread.product_consumer;

/**
 * 1．编写多线程应用程序，模拟多个人通过一个山洞的模拟。这个山洞每次只能通过一个人，
 * 每个人通过山洞的时间为5秒，随机生成10个人，同时准备过此山洞，显示一下每次通过山洞人的姓名。
 * 
 * @author viktor
 * 
 */
class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}
}

public class Cave {

	public synchronized void passCave(Person person) {
		
		System.out.println(person.name+"正在通过山洞中...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(person.name+"通过山洞成功!");
	
	}
}

class CavePerson implements Runnable {
	Person person;
	Cave cave;

	CavePerson(Cave cave,Person person) {
		this.cave = cave;
		this.person = person;
		new Thread(this).start();
	}

	public void run() {
		cave.passCave(person);
		
	}

}

class TestPassCave{
	
	public static void  main(String[] argss){
		String[] perArray = {"张三","李四","王二","小明","小红","小李","麻子","李雷","莉莉","沙沙"};
	    RandomNumber randomNumber=new RandomNumber();
        int c[]=randomNumber.ranNumber();
        
        Cave cave = new Cave();
        for(int d:c){
        	Person person = new Person(perArray[d]);
        	
        	new CavePerson(cave,person);
        }
		
		
	}
}