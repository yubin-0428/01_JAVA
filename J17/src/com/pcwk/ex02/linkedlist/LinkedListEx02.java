/**
* <pre>
* com.pcwk.ex02.linkedlist
* Class Name : LinkedListEx02.java
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

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListEx02 {

    //데이터 삭제
	public static void main(String[] args) {
		
		//데이터 중복 허용,순서유지
		LinkedList<String>  lectureList=
				new LinkedList<>(Arrays.asList("C","JAVA","ORACLE","WEB","SPRING","C"));
		
		System.out.println("lectureList:"+lectureList);
		
		//데이터 삭제:index
		String removeLecture = lectureList.remove(0);
		System.out.println("lectureList:"+lectureList);
		System.out.println("removeLecture:"+removeLecture);
		
		//데이터로 삭제
		boolean flag = lectureList.remove(removeLecture);
		System.out.println("삭제유무:"+flag);
		System.out.println("lectureList:"+lectureList);
		
		//데이터 모두 삭제
		lectureList.clear();
		System.out.println("lectureList:"+lectureList);
	}

}
