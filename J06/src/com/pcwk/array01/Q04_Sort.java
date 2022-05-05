package com.pcwk.array01;

import java.util.Arrays;

public class Q04_Sort {

	public static void main(String[] args) {
		// sort
		int []numArr = {7,4,5,1,3};
		
		// sort전 데이터
		for(int n  :numArr) {
			System.out.print(n+",");
		}
		System.out.println();
		
		for(int i=0;i<numArr.length-1;i++) {
			
			for(int j=0;j<numArr.length-1-i;j++) {
//				if(numArr[j]>numArr[j+1]) {//앞에 값이 크면:ASC
				if(numArr[j]<numArr[j+1]) {//앞에 값이 크면:DESC					
					int tmp   = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = tmp;
				}
			}
			System.out.println((i+1)+","+Arrays.toString(numArr));			
		}//for i
	}

}
//7,4,5,1,3,
//1,[4, 5, 1, 3, 7]
//2,[4, 1, 3, 5, 7]
//3,[1, 3, 4, 5, 7]
//4,[1, 3, 4, 5, 7]
