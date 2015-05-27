package com.scxh.java.ex028.net.socket.chat.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatMultiServer {
	private static final int port = 9527;
	private static boolean listening = true;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			
			ServerSocket serverSocket = new ServerSocket(port);
			
			while(listening){
				System.out.println("正在等待连接中...");
				Socket sokcet = serverSocket.accept();
				
				new Thread(new ChatMultiRunable(sokcet)).start();
			}
			
			
			serverSocket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	

}
