package com.pcwk.array;

public class EX09_Q01 {

	public static void main(String[] args) {
		// Q1. int[] score = {100,88,100,100,90}에 총합과 평균을 구하세요.													
		int[] score = {100,88,100,100,90};
		int sum = 0;     //총점
		float avg = 0.0f;//평균
		
		for(int num :score) {
			sum+=num;
		}
		System.out.println("합계:"+sum);
		avg = sum/(float)score.length;
		
		System.out.println("평균:"+avg);

	}

}
//합계:478
//평균:95.6