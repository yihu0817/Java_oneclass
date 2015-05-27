package com.scxh.java.ex028.net.socket.chat.typeserver;

public class TestChatMultiServer {
	private static final int port = 9527;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ChatMultiServer server = new ChatMultiServer();
		server.startServer(port, "·þÎñ¶Ë");

	}

}
