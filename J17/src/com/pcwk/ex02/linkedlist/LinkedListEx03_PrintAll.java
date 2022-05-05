/**
* <pre>
* com.pcwk.ex02.linkedlist
* Class Name : LinkedListEx03_PrintAll.java
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
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx03_PrintAll {

	//모든 데이터 출력
	public static void main(String[] args) {
		LinkedList<String>  lectureList=
				new LinkedList<>(Arrays.asList("C","JAVA","ORACLE","WEB","SPRING","C"));
		
		
		//for-each:향상된 for반복문
		for(String str  :lectureList) {
			System.out.print(str+", ");
		}
		System.out.println();
		
		//for반복문
		for(int i=0;i<lectureList.size();i++) {
			String delim = ",";
			//마지막에 "," 제거
			if(i == lectureList.size()) {
				delim = "";
			}
			
			System.out.print(lectureList.get(i)+delim);
		}
		System.out.println();
		
		//iterator
		Iterator<String> iter = lectureList.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+", ");
		}
		System.out.println();
		
		//뒤에서 부터 출력: 생성자에 출력 위치 선정:lectureList.size()
		ListIterator<String>   listIterator = lectureList.listIterator(lectureList.size());
		
		while(listIterator.hasPrevious()) {
			System.out.print(listIterator.previous()+", ");
		}
		
		
	}

}
//C, JAVA, ORACLE, WEB, SPRING, C, 
//C,JAVA,ORACLE,WEB,SPRING,C,
//C, JAVA, ORACLE, WEB, SPRING, C, 
//C, SPRING, WEB, ORACLE, JAVA, C, 