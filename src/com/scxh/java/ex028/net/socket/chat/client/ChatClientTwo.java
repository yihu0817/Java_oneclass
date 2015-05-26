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
 * 发送任意条
 *
 * @author viktor
 *
 */
public class ChatClientTwo {
	private static final String host = "192.168.1.199";
	private static final int port = 7776;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			
			Socket client = new Socket(host, port);
			
			
			
			// 字符缓冲标准输入流
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			// 字符缓冲输入流, 读取服务端发送过来的消息。
			BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			// 字符缓冲输出流, 向服务端发送消息。
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(client.getOutputStream()));

			
			
			System.out.println("请输入字符串:");
			String line = sin.readLine();// 从键盘读取一行字符数据
			
			while (!line.equals("over")) {
				writer.println(line); // 向socket管道写入数据，向服务端发送数据
				writer.flush();

				System.out.println("客户端 :" + line);

				String socketLine = reader.readLine(); // 从socket管道读取数据，从服务端读取数据
				System.out.println("服务端 :" + socketLine);
				
				line = sin.readLine();
			}

			
			
			
			// 关闭流
			reader.close();
			writer.close();
			sin.close();
			client.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
