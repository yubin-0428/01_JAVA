package com.pcwk.ed02;

public class EX03_IF_ELSEIF_ELSE {

	public static void main(String[] args) {
//		공원 입장료 계산								
//		취학전 아동: 1000원					8살 미만		
//		초등학생 : 2000원					14살 미만		
//		중/고등학생: 2500원					20살 미만		
//		성인: 3000원							
		
		int age = 8;   //나이
		int charge = 0;//요금
		
		if(age<8) {
			charge = 1000;
		}else if(age<14) {
			charge = 2000;
		}else if(age<20) {
			charge = 2500;
		}else {
			charge = 3000;
		}
		
		
		System.out.println("나이는: "+age);
		System.out.println("요금은: "+charge);
		

	}

}
