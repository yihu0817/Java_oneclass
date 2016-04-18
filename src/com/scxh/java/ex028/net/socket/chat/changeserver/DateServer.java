package com.scxh.java.ex028.net.socket.chat.changeserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

class Operator extends Thread {
	DateServer server;
	Socket sr;
	OutputStream out;
	PrintStream ps;
	List<Socket> clients;

	public Operator(DateServer _server, Socket s, List<Socket> clients) {
		this.clients = clients;
		server = _server;
		this.sr = s;
	}

	public Operator() {
	}

	public void run() {
		try {
			InputStream in = sr.getInputStream();
			BufferedReader bin = new BufferedReader(new InputStreamReader(in));
			String data = bin.readLine();
			while (data != null) {
				// 将接收的信息转发出去
				// 打印接收的信息
				System.out.println(data);
				// 继续读取接收
				for (int j = 0; j < clients.size(); j++)// 服务器将它转发其他所有的客户端
				{
					Socket c1 = clients.get(j);
					out = c1.getOutputStream();
					ps = new PrintStream(out, true);
					if (!c1.equals(sr))
						ps.println(">>" + clients.size() + ":" + data);
					System.out.println("From Client: " + " " + data);
				}
				data = bin.readLine();
			}// end of while
			bin.close();
			ps.close();
			sr.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			server.delCount();
		}
	}// end of run
}// end of class Operator

public class DateServer {
	ServerSocket ss;
	final int MAX_COUNT = 10;
	int connectCount = 0;
	List<Socket> clients = new ArrayList<Socket>();

	public synchronized void addCount() {
		connectCount++;
		System.out.println("After addCount, connectCount=" + connectCount);
	}

	public synchronized void delCount() {
		connectCount--;
		System.out.println("After delCount, connectCount=" + connectCount);
	}

	public synchronized boolean isCountExceed() {
		if (connectCount > MAX_COUNT)
			return true;
		else
			return false;
	}

	public static void main(String args[]) {
		new DateServer().go();
	}

	public void go() {
		// Register your service on port 5678
		try {
			ss = new ServerSocket(5678);
		} catch (IOException e) {
		}
		// Run the listen/accept loop forever
		while (true) {
			try {
				while (isCountExceed()) {
					try {
						Thread.sleep(5000);
					} catch (Exception e) {
					}
				}
				// Wait here and listen for a connection
				Socket s = ss.accept();
				clients.add(s);
				System.out.println("accept one client");
				addCount();
				Operator ms = new Operator(this, s, clients);
				ms.start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} 
	} 
} 