/**
* <pre>
* com.pcwk.ex01.arraylist
* Class Name : ArrayListEx04_Contains.java
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
package com.pcwk.ex01.arraylist;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayListEx04_Contains {


	public static void main(String[] args) {
		//WEB : html,css,javascript
		ArrayList<String>  lectureList=new ArrayList<>(Arrays.asList("JAVA","ORACLE","WEB","SPRING","C"));
		
		//데이터 존재 유무
		boolean contains = lectureList.contains("WEB");
		System.out.println("contains:"+contains);

		//특정 데이터의 인덱스: 존재하는 경우 
		int index = lectureList.indexOf("WEB");
		System.out.println(index);//2
		
		//없는 데이터
		index = lectureList.indexOf("HTML");
		System.out.println(index);//-1
	}

}
//contains:true
//2
//-1