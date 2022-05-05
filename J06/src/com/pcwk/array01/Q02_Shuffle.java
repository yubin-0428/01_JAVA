package com.pcwk.array01;

import java.util.Arrays;

public class Q02_Shuffle {

	public static void main(String[] args) {
//		Q2. 섞기(shuffle)					
//		배열의 요소의 순서를 반복해서 바꾼다.(카드게임,로또번호 생성)	
		//1,2,3,4,5,6,7,8,9,0			
		int numArr[] =new int[10];											
//1. numArr 값을 0~9까지 할당
//2. shuffle
		//1.
		for(int i=0;i<numArr.length;i++) {
			numArr[i] = i;//numArr 값을 0~9까지 할당
		}

		System.out.println(Arrays.toString(numArr));

		//2.
//		두 변수에 값 교환하기									
//		tmp = x;//tmp=10					
//		x   = y; //x = 20					
//		y   = tmp//y=10					
		
		for(int i=0;i<=88;i++) {
			int n =(int)(Math.random()*10);
			//System.out.println("n:"+n);
			int tmp   = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;//numArr[0],numArr[n]값이 교환
		}
		
		System.out.println(Arrays.toString(numArr));
	}

}
//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
//[8, 4, 9, 6, 5, 1, 0, 3, 2, 7]





