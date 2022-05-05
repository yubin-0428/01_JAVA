package com.pcwk.ed02;

public class EX04_For2 {

	public static void main(String[] args) {
		//1-10까지 누적
		
		int sum=0;//합계

		//초기화: for문 내에서 초기화
		for(int i=1;i<=10;i++) {
			sum=sum+i;
		}
		
		System.out.println("1-10까지: "+sum);
	}

}
