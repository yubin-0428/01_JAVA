package com.pcwk.ex02.net;

import java.net.*;
public class URLEx01 {

	public static void main(String[] args) {
//		URL은 인터넷에 존재하는 여러 서버들이 제공하는 자원에 접근할 수 있는 주소를 표현												
//		ex)												
//		프로토콜://호스트명:포트번호/경로명/파일명?쿼리스트링#참조												
//		프로토콜			자원에 접근하기 위해 서버와 통신하는데 사용되는 통신 규약(https)									
//		호스트명			자원을 제공하는 서버의 이름(search.daum.net)									
//		경로명			접근하려는 자원이 저장된 서버상의 위치(									/sample)
//		파일명			접근하려는 자원의 이름(hello.jsp)									
//		쿼리			URL에서 ? 이후의 부분									
//		참조			URL에서 # 이후의 부분									

		try {
			URL url=new URL("http://sinchon.koreaisacademy.com:80/?dGubun=1&_ga=2.28977851.600780303.1646616004-285336498.1638953022");
			
			//호스트명과 포트번호
			System.out.println("호스트명과 포트번호:"+url.getAuthority());
			System.out.println("포트번호:"+url.getDefaultPort());
			System.out.println("프로토콜:"+url.getProtocol());
			System.out.println("쿼리:"+url.getQuery());
			System.out.println("전체 주소:"+url.toURI());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
//호스트명과 포트번호:sinchon.koreaisacademy.com:80
//포트번호:80
//프로토콜:http
//쿼리:dGubun=1&_ga=2.28977851.600780303.1646616004-285336498.1638953022
//전체 주소:http://sinchon.koreaisacademy.com:80/?dGubun=1&_ga=2.28977851.600780303.1646616004-285336498.1638953022
