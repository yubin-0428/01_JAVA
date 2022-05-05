package com.pcwk.ed02;

public class EX05_IF_ELSE {

	public static void main(String[] args) {
		int a = 77;
		int b = 88;
		
		int max = 0;//최대값
		if(a>b) {
			max = a;
		}else {
			max = b;
		}
			
		System.out.println("max="+max);

		max = (a>b)?a:b;
		System.out.println("===============");
		System.out.println("max="+max);
		
	}

}
