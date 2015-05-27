package com.scxh.java.ex028.net.socket.chat.typeclient;


public class TestChatClient {
	private static final String host = "192.168.1.199";
	private static final int port = 9527;

	
	public static void main(String[] args) {
		final ChatClientType client = new ChatClientType(host,port);
		client.name = "ะกร๗";
		
		String message = client.getMessageByKeyBoard(client.sin);

		client.sendMessage(message, client.to);

		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					String fromMessage = client.receiveMessage(client.from);
				
					if (fromMessage != null) {
						client.showMessage(client.name+ " :" + fromMessage);
					}
				}
			}
		}).start();

	}

}
