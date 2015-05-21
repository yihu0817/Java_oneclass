package com.scxh.java.ex026.thread;

public class RunableThread implements Runnable {

//	public RunableThread(String name){
//		Thread thread = new Thread(this);
//		thread.setName(name);
//		thread.start();
//	}
	
	public void run() {
		Thread curentThread = Thread.currentThread();
		
		for(int i = 10; i > 0; i--){
			
			System.out.println(curentThread.getName()+" µ¹¼ÆÊ± :"+i);
			
			try {
				Thread.sleep(100);   
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}

	}
	
	
	

}
