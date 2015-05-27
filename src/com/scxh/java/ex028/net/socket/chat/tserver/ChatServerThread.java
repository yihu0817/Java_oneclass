package com.scxh.java.ex028.net.socket.chat.tserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import com.scxh.java.ex028.net.socket.chat.tclient.ReceiveMessageRunable;

public class ChatServerThread {
	private static final int port = 7776;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			
			//实例化ServerSocket
			ServerSocket serverSocket = new ServerSocket(port);
			//监听客户端socket请求
			Socket socket = serverSocket.accept();
			
			
			//字符缓冲标准输入流
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			//字符缓冲输入流, 读取客户端发送过来的消息。
			final BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//字符缓冲输出流, 向客户端发送消息。
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			ReceiveMessageRunable rmRunable = new ReceiveMessageRunable(reader);
			Thread receiveThread = new Thread(rmRunable);
			receiveThread.start();
			
			
//			// 接收服务端消息线程
//			new Thread(new Runnable() {
//
//				@Override
//				public void run() {
//					while (true) {
//						try {
//							String socketLine = reader.readLine();// 从socket管道读取数据， 从服务端读取数据
//							if(socketLine != null){
//								System.out.println("屌丝  :" + socketLine);
//							}
//
//						} catch (IOException e) {
//							e.printStackTrace();
//						} 
//					}
//
//				}
//			}).start();
			
			
			
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
			serverSocket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
