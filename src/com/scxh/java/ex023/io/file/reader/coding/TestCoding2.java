package com.scxh.java.ex023.io.file.reader.coding;

import java.io.UnsupportedEncodingException;
/**
 * 理解Java控制台输入奇数个中文乱码
 * @author viktor
 *
 */
public class TestCoding2 {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		String gbk = "我";  
		
//		String utf8 = new String(gbk.getBytes("GBK"),"ISO-8859-1");  
//	  
//	    //模拟UTF-8编码的网站显示  
//	    System.out.println(new String(utf8.getBytes("ISO-8859-1"),"GBK"));  
	    
	    
	    printBytes(gbk.getBytes("GBK"));
		printBytes(gbk.getBytes("UTF-8"));
		
		//我,  GBK编码 一个字符对应两个字节
		byte[] bytes = new byte[]{new Byte((byte)0xe6),new Byte((byte)0x88),new Byte((byte)0x91)};
		String utf8 = new String(bytes,"UTF-8"); 
		System.out.println(utf8);

	}
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
}
