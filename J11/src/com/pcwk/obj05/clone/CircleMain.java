package com.pcwk.obj05.clone;

public class CircleMain {

	public static void main(String[] args) {
		//Point p = new Point(1,1);
		Circle c01=new Circle(new Point(1,1), 2.0);
		
		
		//깊은 copy:
//		(Object 클래스의 clone()은 단순히 인스턴스 변수의 값만을 복제 하기 때문에 참조 타입의 인스턴스 변수가 있는																							
//				클래스는 완전한 인스턴스 복제가 이루어 지지 않는다.)																							
		Circle c03Deep=c01.deepCopy();
		System.out.println(c03Deep);
		
		
		//얕은 copy : 사용금지
		Circle c02=c01.clone();
		c02.p.x = 9;
		c02.p.y = 9;
		
		System.out.println("===================");
		System.out.println(c01);
//		System.out.println(c02);
//		r=2.0,p:x=9, y=9
//		r=2.0,p:x=9, y=9



		
		
		
	}

}
