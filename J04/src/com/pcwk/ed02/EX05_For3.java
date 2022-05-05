package com.pcwk.ed02;

public class EX05_For3 {

	public static void main(String[] args) {
		//1-10까지 누적
		
		int sum=0;//합계
       
		//초기화: for문 내에서 초기화
		//조건식이 생략되면 : true
		for(int i=1,j=10;;i++,j--) {
			sum=sum+i;
			//System.out.println("i="+i);
			System.out.println("j="+j);
			if(i==10)break;
		}
		
		System.out.println("1-10까지: "+sum);
	}

}
