package com.pcwk.array;

import java.util.Arrays;

public class EX06_Array {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		int b[] = {0,0,0,0,0,0};
		
		System.out.println("a:"+Arrays.toString(a));
		System.out.println("b:"+Arrays.toString(b));
		
		System.out.println("======================");
		System.arraycopy(a, 2, b, 3, 3);
		System.out.println("after copy b:"+Arrays.toString(b));
	}
}
//   0  1  2  3  4  5
//a:[1, 2, 3, 4, 5, 6]
//b:[0, 0, 0, 0, 0, 0]
//======================
//after copy b:[0, 0, 0, 3, 4, 5]