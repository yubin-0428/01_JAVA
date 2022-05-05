package com.pcwk.ex04.net;
import java.net.*;
import java.io.*;

public class TcpClient {
//	Socket													
//	프로세서간의 통신을 담당하며, Inputstream,OutputStream												

	public static void main(String[] args) {
		//ServerIP, Port
		String serverIp  = "192.168.3.11";
		int    serverPort= 7778;
		
		//Socket생성
		try {
			Socket socket=new Socket(serverIp,serverPort);
			
			//소켓의 input 스트림 생성
			InputStream in = socket.getInputStream();
			DataInputStream  dis=new DataInputStream(in);
			
			//소켓의 입력을 출력한다.
			System.out.println("서버로 부터 받은 메시지: "+dis.readUTF());
			System.out.println("연결을 종료 합니다.");
			
			//스트림과 소켓을 닫는다.
			dis.close();
			socket.close();
			System.out.println("연결을 종료 되었습니다.");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
