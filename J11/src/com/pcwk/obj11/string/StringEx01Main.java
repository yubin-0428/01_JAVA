package com.pcwk.obj11.string;

public class StringEx01Main {

	public static void main(String args[]) {
		String str01=new String("청춘");
		String str02=new String("청춘");
		//데이터 비교는 equals로 할것
		System.out.println(str01.equals(str02));//true
		//주소 비교
		System.out.println(str01 == str02);//false
		
		String str03 = "청춘";
		String str04 = "청춘";
		
		System.out.println(str03 == str04);
		//string에 동등 비교는 항상 equals 사용할것!
		System.out.println(str03.equals(str04));
	}
	

	
	
	
}
