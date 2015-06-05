package com.scxh.java.ex028.net.socket.chat.typeclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 聊天客户端
 * 
 * @author viktor
 * 
 */
public class ChatClientType {
	public static boolean exitFlag = false;
	/**字符缓冲标准输入流**/
	public BufferedReader sin;
	/**字符缓冲输入流, 读取服务端发送过来的消息。*/
	public BufferedReader from;
	/**字符缓冲输出流, 向服务端发送消息。*/
	public PrintWriter to;
	/**sokcet通道*/
	public Socket socket;
	
	public String name;

	public ChatClientType(String host, int port) {
		try {
			socket = new Socket(host, port);

			sin = new BufferedReader(new InputStreamReader(System.in));
			
			from = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			to = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 生成消息 从键盘输入消息.
	 * 
	 * @param keyBoard
	 * @return
	 */
	public String getMessageByKeyBoard(BufferedReader keyBoard) {
		showMessage("请输入发送的消息内容:");
		String line = null;
		try {
			line = keyBoard.readLine();
	
		} catch (IOException e) {
			e.printStackTrace();
		}
		return line;

	}

	/**
	 * 显示消息
	 * 
	 * @param message
	 */
	public void showMessage(String message) {
		System.out.println(message);
	}

	/**
	 * 发送消息
	 */
	public void sendMessage(String message, PrintWriter to) {
		to.println(message); // 向socket管道写入数据，向服务端发送数据
		to.flush();
	}

	/**
	 * 接收消息
	 */
	public String receiveMessage(final BufferedReader from) {
		String socketLine = null;
		try {
			socketLine = from.readLine();// 从socket管道读取数据，

		} catch (IOException e) {
			e.printStackTrace();
		}

		return socketLine;
	}

	/**
	 * 结束聊天
	 */
	public void overChat() {
		exitFlag = true;

		try {
			if (from != null) {
				from.close();
			}
			if (to != null) {
				to.close();
			}
			if (sin != null) {
				sin.close();
			}
			if (socket != null) {
				socket.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
