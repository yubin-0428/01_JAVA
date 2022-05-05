package com.pcwk.ed01;

import java.util.Scanner;

public class EX06_Switch05_Quiz {

	public static void main(String[] args) {
		System.out.print("점수 입력(1~100)>>");
		Scanner scanner=new Scanner(System.in);
		
		int score = scanner.nextInt();//점수
		//System.out.println(score/10);
		char grade = ' ';//학점
		// int/int -> int
		// 91/10   -> 9
		
		switch(score/10) {
		case 10:
		case 9:
				grade = 'A';
			break;
		case 8:
			grade = 'B';
		break;
		case 7:
			grade = 'C';
		break;
		case 6:
			grade = 'D';
		break;	
		default:
			grade = 'F';
			break;
			
		}//--switch

		System.out.println("점수는: "+score);
		System.out.println("학점: "+grade);
		
		
		
	}//--main

}//--class
