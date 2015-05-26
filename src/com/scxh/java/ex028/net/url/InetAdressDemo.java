package com.scxh.java.ex028.net.url;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAdressDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			InetAddress addr = InetAddress.getByName("www.baidu.com");
			String domainName = addr.getHostName();// 获得主机名
			String IPName = addr.getHostAddress();// 获得IP地址
			
			System.out.println(domainName);
			System.out.println(IPName);

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
