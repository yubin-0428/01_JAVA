/**
* <pre>
* com.pcwk.ex02.linkedlist
* Class Name : LinkedListEx01.java
* Description:
* Author: ITSC
* Since: 2022/02/25
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/02/25 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.ex02.linkedlist;

import java.util.*;


public class LinkedListEx01 {

    //LinkedList나 ArrayList사용 방법은 동일
	//추가 변경
	public static void main(String[] args) {
		LinkedList<String> linkedList01 = new LinkedList<>();
		
		//객체 추가: 리스트의 끝에 추가
		linkedList01.add("JAVA");
		linkedList01.add("ORACLE");
		linkedList01.add("WEB");
		System.out.println("linkedList01:"+linkedList01);
		
		//특정위치에 추가
		linkedList01.add(0, "C");
		System.out.println("linkedList01:"+linkedList01);
		//값 변경:set
		linkedList01.set(0, "B");
		System.out.println("linkedList01:"+linkedList01);
	}

}
//linkedList01:[JAVA, ORACLE, WEB]
//linkedList01:[C, JAVA, ORACLE, WEB]
//linkedList01:[B, JAVA, ORACLE, WEB]