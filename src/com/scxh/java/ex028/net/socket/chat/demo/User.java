package com.scxh.java.ex028.net.socket.chat.demo;

import java.net.Socket;
/**
 * 使用说明：1、先将所有的类都编译一下
2、先运行服务器端代码
3、再运行登录界面代码
 * @author viktor
 *
 */
class User {
	private String name;// 用户姓名
	private String sex;// 用户性别
	private Socket sock;// 用户自己的socket

	public User(String name, String sex, Socket sock) {
		setName(name);
		setSex(sex);
		setSock(sock);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Socket getSock() {
		return sock;
	}

	public void setSock(Socket sock) {
		this.sock = sock;
	}

}
