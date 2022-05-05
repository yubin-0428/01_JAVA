package com.pcwk.ed02;

public class EX02_DoWhile {

	public static void main(String[] args) {
		int num=1;
		int sum=0;
		
		do {
			sum+=num;
			System.out.println("num:"+num);
			++num;
		}while(num<=10);			
		//}while(num>10);//무조건 1회는 수행
			
		System.out.println("1-10까지 합:"+sum);
		
	}

}
