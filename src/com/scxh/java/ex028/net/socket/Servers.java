package com.scxh.java.ex028.net.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Servers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(5552);
			Socket socket = server.accept();
			
			InputStream in = socket.getInputStream();
		    InputStreamReader input = new InputStreamReader(in);
		    BufferedReader reader = new BufferedReader(input);
		    
		    String line = reader.readLine();
			
		    System.out.println("服务端接收到信息 ："+line);
		    
		    reader.close();
		    socket.close();
		    server.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
