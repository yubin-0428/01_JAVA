package com.pcwk.loop;

import java.util.Scanner;

public class Q05_01 {

	public static void main(String[] args) {
//		Q1. 두수를 입력받아 사칙 연산을 수행하는 프로그램을 작성 하세요.		
//		(입력은 int로 받으세요. if문으로 작성하세요.)		
		System.out.print("num1을 입력 하세요>>");
		Scanner scanner=new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		System.out.print("num2를 입력 하세요>>");
		int num2 =  scanner.nextInt();
		
		String operator = "+";//연산자
		double result = 0;//연산결과
		
		System.out.print("연산기호를 입력 하세요>>");
		//nextLine() : 위쪽 Enter에 영향을 받음.
		//->next()로 변경
		operator = scanner.next();
		    
		if("+".equals(operator)) {
			result = num1 + num2;
		}else if("-".equals(operator)) {
			result = num1 - num2;
		}else if("*".equals(operator)) {
			result = num1 * num2;
		}else if("/".equals(operator)) {
			result = num1/(double)num2;
		}else {
			System.out.println("연산자를 확인 하세요.");
			return;
		}
		
		System.out.println(num1 +(""+operator)+num2+"="+result);

	}

}
