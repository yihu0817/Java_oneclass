package com.scxh.java.ex028.net.socket.chat.tserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatMultiRunable implements Runnable {
	public Socket socket;

	public ChatMultiRunable(Socket sokcet) {
		this.socket = sokcet;
	}

	@Override
	public void run() {
		try {
			// 字符缓冲标准输入流
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			// 字符缓冲输入流, 读取客户端发送过来的消息。

			final BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// 字符缓冲输出流, 向客户端发送消息。
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			
			// 接收服务端消息线程
			new Thread(new Runnable() {

				@Override
				public void run() {
					while (true) {
						try {
							String socketLine = reader.readLine();// 从socket管道读取数据， 从服务端读取数据
							if(socketLine != null){
								System.out.println("屌丝  :" + socketLine);
							}

						} catch (IOException e) {
							e.printStackTrace();
						} 
					}

				}
			}).start();
			
			
			System.out.println("请输入字符串:");
			String line = sin.readLine();//从键盘读取一行字符数据
			while( !line.equals("over")){
				writer.println(line);   //向socket管道写入数据，向客户端发送数据
				writer.flush();
				
				System.out.println("美女 :"+line);
				line = sin.readLine();
			}
			
			
			
			
			//关闭流
			reader.close();
			writer.close();
			sin.close();
			socket.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
