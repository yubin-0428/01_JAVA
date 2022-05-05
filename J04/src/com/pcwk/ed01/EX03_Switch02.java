package com.pcwk.ed01;

import java.util.Scanner;

public class EX03_Switch02 {

	public static void main(String[] args) {
		
		//console입력
		Scanner scanner=new Scanner(System.in);
		System.out.print("월 입력>");
		
		int month = 1;// 월
		month = scanner.nextInt();
		
		int day = 0;// 일수

		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
			day = 28;
			break;
		default:
			day = 31;
			break;
		}

		System.out.println("월: " + month);
		System.out.println("일수: " + day);

	}

}
