package com.pcwk.ed02;

public class EX06_Continue {

	public static void main(String[] args) {
//		continue문									
//		현재의 반복을 뛰어 넣고 반복을 진행한다.								
//		1 ~ 100까지 홀수 만 더하기								
			
		int total = 0;
		int num;
        //continue만나면 for에 증감식으로 간다.
		for(num=1;num<=100;num++) {
			if(num % 2 == 0) {//짝수
				continue;
			}
			System.out.println(num);
			total+=num;
		}
		
		System.out.println("1 ~ 100까지 홀수 합:"+total);
		
	}

}
