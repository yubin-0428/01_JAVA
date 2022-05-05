/**
* <pre>
* com.pcwk.ex01.arraylist
* Class Name : ArrayListEx03_PrintAll.java
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

import java.util.*;

public class ArrayListEx03_PrintAll {


	public static void main(String[] args) {
		ArrayList<String>  lectureList=new ArrayList<>(Arrays.asList("C","JAVA","ORACLE","WEB","SPRING","C"));
		
		//for-each: 향상된 for
		for(String lec  :lectureList) {
			System.out.print(lec+", ");
		}
		System.out.println("");
		
		
		//for 반복문
		for(int i=0;i<lectureList.size();i++) {
			String delim = ", ";
			if(i ==lectureList.size() -1 ) {
				delim = "";
			}
			System.out.print(lectureList.get(i)+delim);
		}
		System.out.println("");
		
		//iterator: 앞에서 부터 뒤로 반복 출력
		//while
		Iterator<String> iterator = lectureList.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+", ");
		}
		System.out.println("");
	    System.out.println("==========================================");
		//ListIterator: 뒤에서 부터 앞으로 출력
	    
		ListIterator<String>   listIterator = lectureList.listIterator(lectureList.size());//start index
		while(listIterator.hasPrevious()) {
			System.out.print(listIterator.previous() +", ");
		}
		
		
	}

}
