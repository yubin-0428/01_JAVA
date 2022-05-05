/**
* <pre>
* com.pcwk.util.ex02.stringtokenizer
* Class Name : TokenizerEx03.java
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

public class TokenizerEx03 {

	//"1,김천재,100,100,100|2.박수재,95,80,90|3.이자바,80,90,90"
	public static void main(String[] args) {
		String source = "1,김천재,100,100,100|2,박수재,95,80,90|3,이자바,80,90,90";
		StringTokenizer st=new StringTokenizer(source, "|");
		
		while(st.hasMoreTokens()) {
			String man = st.nextToken();
			System.out.println(man);
			//1,김천재,100,100,100
			StringTokenizer  st02=new StringTokenizer(man, ",");
			while(st02.hasMoreTokens()) {
				
				System.out.println(st02.nextToken());
				
			}//--while inner
			
			
		}//--while outer
		

	}//--main

}
