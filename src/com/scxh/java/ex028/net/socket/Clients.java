package com.scxh.java.ex028.net.socket;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Clients {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Socket client = new Socket("192.168.1.199", 5552);

			OutputStream out = client.getOutputStream();
			OutputStreamWriter outWriter = new OutputStreamWriter(out);
			BufferedWriter writer = new BufferedWriter(outWriter);
			writer.write("你好");
			System.out.println("客户端发送信息成功!");

			writer.close();
			client.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
