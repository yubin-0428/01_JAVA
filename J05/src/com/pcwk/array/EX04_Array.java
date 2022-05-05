package com.pcwk.array;

import java.util.Arrays;

public class EX04_Array {

	public static void main(String[] args) {
		double[]  data=new double[5];
		//데이터가 있는 요소만 출력
		System.out.println("배열의 초기값:"+Arrays.toString(data));
		
		int size = 0;//배열 인덱스
		data[0] =10.0;//배열요소 0번째에 10.0 대입
		
		size++;
		data[1] =20.0;//배열요소 1번째에 20.0 대입

		size++;
		data[2] =30.0;//배열요소 2번째에 30.0 대입
		
		size++;
		
		for(int i=0;i<size;i++) {
			System.out.println(data[i]);
		}
		System.out.println("================");
		System.out.println(Arrays.toString(data));
	}

}
//배열의 초기값:[0.0, 0.0, 0.0, 0.0, 0.0]
//10.0
//20.0
//30.0
//================
//[10.0, 20.0, 30.0, 0.0, 0.0]
