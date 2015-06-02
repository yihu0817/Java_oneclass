package com.scxh.java.ex023.io.file.reader.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SysInDemo {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// String encoding = System.getProperty("file.encoding");
		// System.out.println(encoding);
		//		
		// System.setProperty("file.encoding", "GBK");
		//		
		// encoding = System.getProperty("file.encoding");
		// System.out.println(encoding);
	

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		String message;
		while ((message = reader.readLine()) != null) {
			System.out.println(message);

			// String iso = new String(message.getBytes("UTF-8"),"ISO-8859-1");

			// 模拟UTF-8编码的网站显示
			// System.out.println(new
			// String(iso.getBytes("ISO-8859-1"),"UTF-8"));
		}
	}

}
