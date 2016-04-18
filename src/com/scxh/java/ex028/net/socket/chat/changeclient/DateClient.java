package com.scxh.java.ex028.net.socket.chat.changeclient;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;

public class DateClient extends Thread {
	Socket s1;

	public static void main(String args[]) {
		PrintStream ps1;
		DataInputStream KeyInput = new DataInputStream(System.in);
		String sdata;
		DateClient dc = new DateClient();
		try {
			dc.s1 = new Socket("127.0.0.1", 5678);
		} catch (UnknownHostException e1) {

			e1.printStackTrace();
		} catch (IOException e1) {

			e1.printStackTrace();
		}
		dc.setName(args[0]);
		dc.start();
		while (true) {
			try {
				OutputStream out1 = dc.s1.getOutputStream();
				ps1 = new PrintStream(out1, true);
				sdata = KeyInput.readLine(); // 以行形式读入
				System.out.println("" + sdata);
				ps1.println(args[0] + ":" + sdata);
			} catch (IOException e) {
				return;
			}
		}
	}

	public void run() {
		OutputStream out;
		PrintStream ps;
		try {
			out = s1.getOutputStream();
			ps = new PrintStream(out, true);
			ps.println(getName() + ":" + new Date().toString() + " Connected");
			System.out.println("send:" + getName() + ":" + new Date().toString());
			// 接收服务器转发来的消息
			InputStream in = s1.getInputStream();
			BufferedReader bin = new BufferedReader(new InputStreamReader(in));
			String data = bin.readLine();
			while (data != null) {
				System.out.println(data);
				data = bin.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 
} 