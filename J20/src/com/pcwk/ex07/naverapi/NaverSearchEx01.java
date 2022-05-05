/**
* <pre>
* com.pcwk.ex07.naverapi
* Class Name : NaverSearchEx01.java
* Description:
* Author: ITSC
* Since: 2022/03/03
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/03/03 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.ex07.naverapi;

import java.io.*;
import java.net.*;


public class NaverSearchEx01 {


	public static void main(String[] args) {
	    String clientId = "PF2hZcj7_cmVHc8unUOn";	//클라이언트 아이디
	    String clientSecret = "Z2F9wQ0NVO";         //클라이언트 시크릿

		if(args.length !=1) {//param이 없으면 종료
			System.out.println("검색어를 입력 하세요.");
			System.exit(0);
		}
		
	    String text = args[0];//검색어
	    BufferedReader  br = null;
	    
	    try {
	    	text = URLEncoder.encode(text, "UTF-8");
	    	System.out.println("text:"+text);
	    	//blog: json
	    	//String apiURL = "https://openapi.naver.com/v1/search/blog?query="+text;
	    	
	    	//news
	    	String apiURL = "https://openapi.naver.com/v1/search/news.json?query="+text;
	    	
	    	//책:json
	    	//String apiURL = "https://openapi.naver.com/v1/search/book.json?query="+text;
	    	
	    	//책:xml
	    	//String apiURL = "https://openapi.naver.com/v1/search/book.xml?query="+text;
	    	
	    	//
	    	System.out.println("apiURL:"+apiURL);
	    	
	    	URL  url=new URL(apiURL);//URL 
	    	
	    	//clientId,clientSecret 적용을 위한 HttpURLConnection
	    	HttpURLConnection con =(HttpURLConnection) url.openConnection();
	    	con.setRequestMethod("GET");//GET방식으로 접근
	    	con.setRequestProperty("X-Naver-Client-Id", clientId);//clientId
	    	con.setRequestProperty("X-Naver-Client-Secret",clientSecret);//clientSecret
	    	
	    	//200: 성공
	    	//401: 인증실패
	    	int responseCode=con.getResponseCode();
	    	System.out.println("responseCode:"+responseCode);
	    	
	    	if(200==responseCode) {//성공
	    	     //byte 스트림을 char 스트림으로 연결->BufferedReader생성
	    	     br=new BufferedReader(new InputStreamReader(con.getInputStream()));
	    		
	    	     //가지고 온 데이터 출력
	    	     String line = "";
	    	     while( (line=br.readLine()) != null   ) {
	    	    	 System.out.println(line);
	    	     }
	    	     
	    	     
	    	}else {
	    		System.out.println("클라이언트 아이디, 클라이언트 시크릿을 확인 하세요.");
	    		return;
	    	}
	    	
	    	
	    }catch(IOException e) {
	    	System.out.println("==============================================");
	    	System.out.println("=IOException="+e.getMessage());
	    	System.out.println("==============================================");
	    	e.printStackTrace();
	    }finally {
	    	try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }
	    
	    
	    
	    
	    
	}

}

//{
//"lastBuildDate": "Thu, 03 Mar 2022 15:16:44 +0900",
//"total": 755841,
//"start": 1,
//"display": 10,
//"items": [
//{
//"title": "<b>자바</b>학원 효과적으로 배우고 싶다면!",
//"link": "https:\/\/blog.naver.com\/ssoyeon12?Redirect=Log&logNo=222648861125",
//"description": "<b>자바</b>에 관해서 배우고 싶다는 생각을 하게 되었는데요. 원래는 제약회사 영업직으로 일하고 있었기에, 코딩에 대해서는 잘 모르는 상태였어요. 그렇지만, 더 늦기 전에 배워보고 싶다는 마음이 들어 <b>자바</b>학원... ",
//"bloggername": "요롱일상",
//"bloggerlink": "https://blog.naver.com/ssoyeon12",
//"postdate": "20220216"
//
//},


