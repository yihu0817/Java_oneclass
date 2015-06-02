package com.scxh.java.ex023.io.file.reader.coding;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Bianma {
	private static void printBytes(byte[] bytes) {
		for (byte b : bytes) {
			printByte(b);
		}
		System.out.println();
	}

	private static void printByte(byte abyte) {
		String hex = "00" + Integer.toHexString((int) abyte);
		System.out.print(hex.substring(hex.length() - 2) + "\t");
	}

	public static void main(String[] args) throws IOException {
//		String s = "陶";
//		printBytes(s.getBytes("GBK"));
//		printBytes(s.getBytes("UTF-8"));
//		byte b = (byte) System.in.read();
//		while ((char)b != 'e') {
//			printByte(b);
//			b = (byte) System.in.read();
//			
//		}
//		
//		byteToString();
		
		correctEncode();
	}
	/**
	 * 
	 * @throws UnsupportedEncodingException
	 */
	public static void byteToString() throws UnsupportedEncodingException{
		byte[] b = new byte[]{new Byte((byte) 0xcc), new Byte((byte) 0xd5)};
		System.out.println(new String(b, "GBK"));
	}
	
	
	public static void correctEncode() throws UnsupportedEncodingException {
		String gbk = "我来了";
		String iso = new String(gbk.getBytes("UTF-8"),"GBK");
		
		System.out.println(iso);
		
		for (byte b : iso.getBytes("ISO-8859-1")) {
			System.out.print(b + " ");
		}
		System.out.println();

		//模拟UTF-8编码的网站显示
		System.out.println(new String(iso.getBytes("ISO-8859-1"),"UTF-8"));
	}
}
