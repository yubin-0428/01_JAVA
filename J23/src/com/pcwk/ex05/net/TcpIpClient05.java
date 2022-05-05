package com.pcwk.ex05.net;

import java.io.IOException;
import java.net.Socket;

public class TcpIpClient05 {

	public static void main(String[] args) {
		String serverIp = "192.168.3.11";
		int    port     = 8888;
		
		try {
			//client socket생성
			Socket socket=new Socket(serverIp, port);
			
			Sender sender=new Sender(socket);
			Receiver receiver=new Receiver(socket);  
			
			sender.start();
			receiver.start();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
