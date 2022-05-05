/**
* <pre>
* com.pcwk.ex03.set
* Class Name : HashSetEx01Add.java
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
package com.pcwk.ex03.set;

import java.util.HashSet;
import java.util.Arrays;

public class HashSetEx01Add {

	//1. 중복 값을 허용하지 않음.
	//2. 입력한 순서가 보장되지 않는다.
	//3. null값을 허용한다.
	//중복된 값을 허용하지 않는 특징이 있기 때문에 값의 존재 유무를 파악할 때 사용.
	public static void main(String[] args) {
		HashSet<String> hashLec = new HashSet<>();//default initial capacity (16)
		hashLec.add("JAVA");
		hashLec.add("ORACLE");
		hashLec.add("WEB");
		
		System.out.println("hashLec:"+hashLec);//hashLec:[JAVA, WEB, ORACLE]
		//WEB 중복
		HashSet<String> otherLec=new HashSet<>(Arrays.asList("WEB","SPRING","C"));
        
		hashLec.addAll(otherLec);//Collection추가
		System.out.println("hashLec:"+hashLec);//hashLec:[JAVA, SPRING, C, WEB, ORACLE]
	}

}
