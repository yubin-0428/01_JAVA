package com.pcwk.loop;

public class Q05_03 {
//	2*1=2
//	2*2=4
//	2*3=6
//	2*4=8
//	2*5=10
//	2*6=12
//	2*7=14
//	2*8=16
//	2*9=18

	public static void main(String[] args) {
		// Q3. 구구단의 짝수단만 출력 하도록 프로그램을 작성하세요.											
		// for(){//2-9
		//   for(){//1-9
		//
		//   }
		// }
		
		for(int i=2;i<=9;i++) {
			if(i %2 != 0) {//홀수 걸러내기!
				continue;
			}
			
			for(int j=1;j<=9;j++) {
				System.out.println(i +"*"+j+"="+(i*j));
			}
			System.out.println();
		}
		
		

	}

}
