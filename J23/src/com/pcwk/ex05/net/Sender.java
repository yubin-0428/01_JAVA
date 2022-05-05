package com.pcwk.ex05.net;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
//DataOutputStream통한 전송
public class Sender extends Thread {
	Socket socket; //socket
	DataOutputStream  out;
	String name ;
	
	public Sender(Socket socket) {
		this.socket = socket;
		try {
			out = new DataOutputStream(socket.getOutputStream());
			name= "["+socket.getInetAddress()+":"+socket.getPort()+"]";//[192.168.3.101:7777]
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//message입력, 전송
	@Override
	public void run() {
		Scanner scanner=new Scanner(System.in);
		while(out !=null) {
			try {
				out.writeUTF(name+" "+scanner.nextLine());//[192.168.3.101:7777] 안녕하세요.
			} catch (IOException e) {
				e.printStackTrace();
			}//
		}//--while
		
		
	}

	
}







