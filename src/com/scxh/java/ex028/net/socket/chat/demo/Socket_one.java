package com.scxh.java.ex028.net.socket.chat.demo;

import java.net.Socket;

public class Socket_one// 客户端
{
	private static final int PORT = 6666;// 端口
	public static String user;
	public static Socket socket;

	public Socket_one(String user) {
		this.user = user;

		try {
			socket = new Socket("127.0.0.1", PORT);// 建立socket连接
			System.out.println("【" + user + "】欢迎来到聊天室！");

			Thread tt = new Thread(new Recove(socket, user));// 建立客户端线程
			tt.start();// 启动线程
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		new Socket_one(user);

	}
}