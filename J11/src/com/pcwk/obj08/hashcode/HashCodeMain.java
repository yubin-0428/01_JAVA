package com.pcwk.obj08.hashcode;

public class HashCodeMain {

	public static void main(String[] args) {
		String str01=new String("KOREA IT");
		String str02=new String("KOREA IT");

		//equals 오버라이딩해서 데이터로 비교
		System.out.println(str01.equals(str02));//true
		System.out.println(str01.hashCode());//1373385857
		System.out.println(str02.hashCode());//1373385857
		
		//객체의 주소값으로 해시코드를 생성하므로 객체마다 모두 다르다.
		System.out.println(System.identityHashCode(str01));//366712642
		System.out.println(System.identityHashCode(str02));//1829164700
		
		
	}

}
