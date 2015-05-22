package com.scxh.java.ex027.thread;
/**
 * [Hello] [Synchronized] [World]
 * @author viktor
 *
 */
class Callme {
	synchronized  void call(String msg) {
		System.out.print("[" + msg);   //[Hello  [Synchronized  ]  ]  [World]    
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.println("]");
	}
}

class Caller implements Runnable {
	
	String msg;
	Callme target;
	Thread t;
	public Caller(Callme target, String msg) {
		
		this.target = target;
		this.msg = msg;
		t = new Thread(this);
		t.start();
	}

	public void run() {
		target.call(msg);
	}
}

class Synch {
	public static void main(String args[]) {
		Callme target = new Callme();
		new Caller(target, "Hello");
		new Caller(target, "Synchronized");
		new Caller(target, "World");
		
//		Callme target = new Callme();
//		Caller ob1 = new Caller(target, "Hello");   
//		Caller ob2 = new Caller(target, "Synchronized");
//		Caller ob3 = new Caller(target, "World");
		// wait for threads to end
//		try {
//			ob1.t.join();
//			ob2.t.join();
//			ob3.t.join();
//		} catch (InterruptedException e) {
//			System.out.println("Interrupted");
//		}
	}
}
