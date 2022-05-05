/**
* <pre>
* com.pcwk.util.ex02.stringtokenizer
* Class Name : TokenizerEx02.java
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

public class TokenizerEx02 {

	/**
	 * + - * / =()
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String expression = "x=100*(200+300)/2";
		//true : token delim return
		StringTokenizer st=new StringTokenizer(expression, "+-/*=()", true);
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}

}
