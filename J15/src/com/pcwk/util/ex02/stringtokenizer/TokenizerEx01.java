/**
* <pre>
* com.pcwk.util.ex02.stringtokenizer
* Class Name : TokenizerEx01.java
* Description:
* Author: ITSC
* Since: 2022/02/23
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/02/23 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.util.ex02.stringtokenizer;

import java.util.StringTokenizer;
//ctrl + shift+ o : import정리 : * -> 사용하는 클래스로, 사용하지 않는 import삭제
//ctrl + shift+ f : 소스정리
public class TokenizerEx01 {

//	java.util.StringTokenizer							
//	긴 문자열을 지정된 구분자(delimiter)를 기준으로 토큰(token)이라는 여러개 문자열로 잘라내는 데					
//	사용한다.					

	public static void main(String[] args) {
		String source = "100,200,300,400,500";
		
		StringTokenizer st=new StringTokenizer(source,",");//\t\n\r\f default구분자

		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());     
		}
		
	}

}
//100
//200
//300
//400
//500