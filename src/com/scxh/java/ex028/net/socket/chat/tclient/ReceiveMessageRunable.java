package com.scxh.java.ex028.net.socket.chat.tclient;

import java.io.BufferedReader;
import java.io.IOException;

public class ReceiveMessageRunable implements Runnable {
	
	public BufferedReader reader;
	
	public ReceiveMessageRunable(BufferedReader reader){
		this.reader = reader;
	}
	
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

}
