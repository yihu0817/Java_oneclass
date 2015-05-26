package com.scxh.java.ex028.net.socket.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
	private static final int port = 7776;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			//字符缓冲标准输入流
			BufferedReader sin = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("请输入字符串:");
			String line = sin.readLine();//从键盘读取一行字符数据
			
			//实例化ServerSocket
			ServerSocket serverSocket = new ServerSocket(port);
			//监听客户端socket请求
			Socket server = serverSocket.accept();
			
			//字符缓冲输入流, 读取客户端发送过来的消息。
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					server.getInputStream()));

			//字符缓冲输出流, 向客户端发送消息。
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(
					server.getOutputStream()));
			
			
			writer.println(line);   //向socket管道写入数据，向客户端发送数据
			
			writer.flush();
			
			String socketLine = reader.readLine();  //从socket管道读取数据， 从客户端读取数据
			
			System.out.println("接收客户端数据 :"+socketLine);
			
			
			//关闭流
			reader.close();
			writer.close();
			sin.close();
			server.close();
			serverSocket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
