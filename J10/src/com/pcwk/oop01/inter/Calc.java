package com.pcwk.oop01.inter;

public interface Calc {
  //인터페이스
  //모든 메서드가 추상 메서드(abstract), 모든 변수는 상수(public final)
  //변수에 public final 생략가능
  //메서드에 public abstract 생략가능	
	
  //public final double PI = 3.14;	
	double PI = 3.14;
	
	int ERROR = -999999;
	
	//public abstract int add(int num1, int num2);
	/**
	 * 더하기
	 * @param num1
	 * @param num2
	 * @return num1+num2
	 */
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int divide(int num1, int num2);
	int times(int num1, int num2);
	
	//Abstract methods do not specify a body
//    public void disp() {
//    	
//    }
}
