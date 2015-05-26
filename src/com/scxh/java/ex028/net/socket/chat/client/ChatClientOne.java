package com.scxh.java.ex028.net.socket.chat.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Sokcet通讯
 * 客户端向服务端发送消息
 * 只能发送一条
 * @author viktor
 *
 */
public class ChatClientOne {
	private static final String host = "192.168.1.199";
	private static final int port = 7776;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			
			//=================建立Socket连接====================
			
			Socket socket = new Socket(host, port);
			
			//=================建立Socket连接====================
			
			
			
			//==================初始化操作=======================
			
			// 字符缓冲标准输入流,  获取从键盘输入的字符串
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			
			// 字符缓冲输入流, 读取服务端发送过来的消息。
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// 字符输出流, 向服务端发送消息。
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

			//==================初始化操作=======================
			
			
			
			System.out.println("请输入字符串:");
			
			String line = sin.readLine();// 从键盘读取一行字符串数据
			System.out.println("客户端 :" + line);
			
			writer.println(line); // 向socket管道写入数据，向服务端发送数据
			writer.flush();

			String socketLine = reader.readLine(); // 从socket管道读取数据， 从服务端读取数据
			System.out.println("服务端 :" + socketLine);

			
			
			//====================== 关闭流======================
			reader.close();
			writer.close();
			sin.close();
			socket.close();
			//====================== 关闭流======================
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
