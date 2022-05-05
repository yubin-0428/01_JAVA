package com.pcwk.time.ex06.generics;
import java.util.*;
public class GenericsEx01 {

	public static void main(String[] args) {
//		지네릭스(Generics)						
//		클래스가 다룰 객체를 미리 명시해주는 것.				
//		컬렉션 클래스에서 컴파일 시 타입체크를 해주는 기능이다.				
//	장점					
//		1. 타입 안정성을 제공한다.				
//		2. 타입체크와 형변환을 생략할 수 있으므로 코드가 간결해 진다.				

		ArrayList list = new ArrayList();
		list.add("apple");
		
		//지네릭스(Generics) 사용하지 않으면 casting필요
		String str = (String) list.get(0);
		

		
		List<String> list01 = new ArrayList<>();
		list01.add("apple");
		//casting 불필요
		String str02 = list01.get(0);
		
	}

}
