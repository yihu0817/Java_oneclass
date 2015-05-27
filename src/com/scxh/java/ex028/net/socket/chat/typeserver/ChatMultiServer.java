package com.scxh.java.ex028.net.socket.chat.typeserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatMultiServer {
	private static boolean listening = true;

	private String serverName = "服务端";
	/**
	 * 启动聊天服务器
	 */
	public void startServer(int port,String name){
		serverName = name;
		try {
			int count = 0; //表示客户端个数
			
			ServerSocket serverSocket = new ServerSocket(port);
			
			while (listening) {

				Socket sokcet = serverSocket.accept();

				new Thread(new ChatMultiServer().new ChatServerRunable(sokcet,
						++count)).start();

			}

			serverSocket.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	class ChatServerRunable implements Runnable {
		/** 字符缓冲标准输入流 **/
		public BufferedReader sin;
		/** 字符缓冲输入流, 读取服务端发送过来的消息。 */
		public BufferedReader from;
		/** 字符缓冲输出流, 向服务端发送消息。 */
		public PrintWriter to;
		/** sokcet通道 */
		public Socket socket;
		public int count;

		public ChatServerRunable(Socket socket, int count) {
			try {
				this.socket = socket;
				this.count = count;
				sin = new BufferedReader(new InputStreamReader(System.in));

				from = new BufferedReader(new InputStreamReader(socket
						.getInputStream()));

				to = new PrintWriter(new OutputStreamWriter(socket
						.getOutputStream()));

			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		/**
		 * 生成消息 从键盘输入消息.
		 * 
		 * @param keyBoard
		 * @return
		 */
		public String getMessageByKeyBoard(BufferedReader keyBoard) {
			showMessage("请输入发送的消息内容:");
			String line = null;
			try {
				line = keyBoard.readLine();

			} catch (IOException e) {
				e.printStackTrace();
			}
			return line;

		}

		/**
		 * 显示消息
		 * 
		 * @param message
		 */
		public void showMessage(String message) {
			System.out.println(message);
		}

		/**
		 * 发送消息
		 */
		public void sendMessage(String message, PrintWriter to) {
			to.println(message); // 向socket管道写入数据，向服务端发送数据
			to.flush();
		}

		/**
		 * 接收消息
		 */
		public String receiveMessage(final BufferedReader from) {
			String socketLine = null;
			try {
				socketLine = from.readLine();// 从socket管道读取数据，

			} catch (IOException e) {
				e.printStackTrace();
			}

			return socketLine;
		}

		/**
		 * 结束聊天
		 */
		public void overChat() {

			try {
				if (from != null) {
					from.close();
				}
				if (to != null) {
					to.close();
				}
				if (sin != null) {
					sin.close();
				}
				if (socket != null) {
					socket.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		@Override
		public void run() {
			// 接收服务端消息线程
			new Thread(new Runnable() {

				@Override
				public void run() {
					while (true) {
						String fromMessage = receiveMessage(from);
						if (fromMessage != null) {
							showMessage("客户端 :" + fromMessage);
						}
					}
				}
			}).start();

			String toMessage = getMessageByKeyBoard(sin);

			while (!toMessage.equals("over")) {

				sendMessage(toMessage, to);

				showMessage(serverName +" :" + toMessage);

				toMessage = getMessageByKeyBoard(sin);
			}

		}

	}

}
