package com.pcwk.ed02;

public class EX01_While01 {

	public static void main(String[] args) {
		int num;//숫자(증가)
		int sum;//합계
		
		//초기화
		num = 1;
		sum = 0;
		
		while(num<=10) {
			sum = sum + num;//sum +=num
			System.out.println(num);
			++num;          //num = num +1
			
		}//--while
		System.out.println("sum="+sum);//sum=55

	}

}
