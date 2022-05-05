package com.pcwk.oop01.inter;

public class CalculatorMain {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		
		//약한 결합
		Calc cal=new Calculator();
		
		System.out.println("add:"+cal.add(num1, num2));
		System.out.println("substract:"+cal.substract(num1, num2));
		System.out.println("times:"+cal.times(num1, num2));
		System.out.println("divide: "+cal.divide(num1, num2));
	}

}
