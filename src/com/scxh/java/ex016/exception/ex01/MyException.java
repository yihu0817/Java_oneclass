package com.scxh.java.ex016.exception.ex01;

public class MyException extends Exception {
	public MyException() {
		System.out.println("自定义异常初始化");
	}

	public String getMessage() {
		return "网络出错，连接服务器失败！";
	}
}
