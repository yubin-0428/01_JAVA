package com.pcwk.ex02.net;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

public class URLConnectionEX02 {

	public static void main(String[] args) {
//		URLConnection												
//		URLConnection은 어플리케이션과 URL간의 통신연결을 나타내는 클래스의 최상위 클래스											
		URL url = null;
		String address = "http://sinchon.koreaisacademy.com/?dGubun=1&_ga=2.28977851.600780303.1646616004-285336498.1638953022";
		
		BufferedReader  input = null;
		try {
			url = new URL(address);
			//버퍼(byte 스트림을 char(Inputstream));
			input = new BufferedReader(new InputStreamReader(url.openStream()));
			String line = "";
			while( (line=input.readLine() ) !=null) {
				//byte[] eucKrStringBuffer = line.getBytes("utf-8");
//				CharBuffer cbuffer = CharBuffer.wrap((new String(line, "EUC-KR")).toCharArray());
//
//				Charset utf8charset = Charset.forName("UTF-8");
//				String decodedFromUtf8 = utf8charset.;
//
//
//				System.out.println(decodedFromUtf8);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
