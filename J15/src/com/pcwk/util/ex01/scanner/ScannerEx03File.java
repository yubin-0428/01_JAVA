/**
* <pre>
* com.pcwk.util.ex01.scanner
* Class Name : ScannerEx03File.java
* Description:
* Author: ITSC
* Since: 2022/02/23
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/02/23 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.util.ex01.scanner;

//ctrl + shift+ o : import정리 : * -> 사용하는 클래스로, 사용하지 않는 import삭제
//ctrl + shift+ f : 소스정리

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ScannerEx03File {

//	100,100,100 한줄을 읽는다. 100,100,100 -> 100 100 100
//	200,200,200
//	300,300,300
//	400,400,400
//	500,500,500
	public static void main(String[] args) {		
		//"C:\\DCOM_20220127\\01_JAVA\\workspace\\J15\\src\\com\\pcwk\\util\\ex01\\scanner\\data99array.txt"
		try {
			Scanner scanner=new Scanner(new File("C:\\DCOM_20220127\\01_JAVA\\workspace\\J15\\src\\com\\pcwk\\util\\ex01\\scanner\\data99array.txt"));
			int totalSum = 0;//총합
			int cnt      = 0;//건수
			
			//ctrl + shift + f
			while(scanner.hasNextLine()) {//데이가 있는 라인이 있으면 true, 그렇치 않으면 false
				String line = scanner.nextLine();//100,100,100
				System.out.println(line);
				
				//데이터를 ","기준으로 자르기
				Scanner sc02=new Scanner(line).useDelimiter(",");//100,100,100
				int sum = 0;
				while(sc02.hasNextInt() == true) {
					sum += sc02.nextInt();
				}//--while inner
				//System.out.println("sum(Line) :"+sum);
				totalSum +=sum;
				cnt++;//읽은 Line수
				
			}//while outer
			
			System.out.print("Line:"+cnt);
			System.out.println(", 총합:"+totalSum);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("file read성공!");
		

	}

}
//sum(Line) :300
//sum(Line) :600
//sum(Line) :900
//sum(Line) :1200
//sum(Line) :1500
//Line:5, 총합:4500