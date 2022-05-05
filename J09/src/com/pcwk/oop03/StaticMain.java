package com.pcwk.oop03;

public class StaticMain {

	public static void main(String[] args) {
		StaticPractice.say();
		System.out.println("num:"+StaticPractice.num);
		System.out.println("======================");
		StaticPractice sp=new StaticPractice();
		
		
	}

}
//클래스 초기화 블럭
//인스턴스를 생성하지 않고도 사용 가능.
//num:11
//======================
//default생성자