package com.pcwk.oop08.poly;

public class PolyCastingMain {

	public static void main(String[] args) {
		// 형재간에 관계: 형변환 불가
		//Type mismatch: cannot convert from Ambulance to FireEngine
		//FireEngine f=new FireEngine();
		//Ambulance  a=new Ambulance();
		//f = a;
		
		Car car = null;
		FireEngine  fe01=new FireEngine();
		FireEngine  fe02=new FireEngine();
		//자손타입 '-> 조상타입(Up-casting) : 형변환 생략 가능											
		car = fe01;//OK
		car.drive();
		//car.warter(); 컴파일 오류
		
		//조상타입 '-> 자손타입(Down-casting) : 형변환 생략 불가												
		fe02 = (FireEngine) car;
		fe02.water();//water!
		
	}

}
