/**
* <pre>
* com.pcwk.ex03.set
* Class Name : HashSetEx02_Remove_PrintAll.java
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

import java.util.*;

public class HashSetEx02_Remove_PrintAll {


	public static void main(String[] args) {
		//추가
		//삭제
		//제체 출력
		
		HashSet<String>  lectureSet=new HashSet<>();
		//추가
		lectureSet.add("C");
		lectureSet.add("JAVA");
		lectureSet.add("WEB");
		lectureSet.add("SPRING");
		
		HashSet<String>  lectureCpSet = new HashSet<>(lectureSet);
		
		
		System.out.println("lectureSet:"+lectureSet);//lectureSet:[JAVA, SPRING, C, WEB]
		//삭제
		lectureSet.remove("C");
		System.out.println("lectureSet:"+lectureSet);//lectureSet:[JAVA, SPRING, WEB]
		
		//다건 삭제
		lectureSet.removeAll(Arrays.asList("JAVA","WEB"));
		System.out.println("lectureSet:"+lectureSet);//[SPRING]
		
		//전체 삭제
		lectureSet.clear();
		System.out.println("lectureSet:"+lectureSet);//lectureSet:[]
		System.out.println("=전체 출력===============================");
		
		//for-each loop
		for(String lec:lectureCpSet) {			
			System.out.print(lec+", ");
		}
		System.out.println();
		//using iterator
		Iterator<String> iter= lectureCpSet.iterator();
		
		while(iter.hasNext()) {//element가 있으면 true
			System.out.print(iter.next()+", ");
		}
		

	}

}
