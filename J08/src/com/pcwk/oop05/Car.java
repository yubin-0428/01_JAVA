package com.pcwk.oop05;

public class Car {
	String color;//색상
	String gearType;//변속기 종류
	int door;
	
	public Car() {
		this("white");
	}
	
	public Car(String color) {
		//인자 3개 생성자 호출
		this(color,"auto",4);
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", gearType=" + gearType + ", door=" + door + "]";
	}

	public Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	
	
	
//	public Car(String color,String gearType,int door) {
//		this.color    = color;
//		this.gearType = gearType;
//		this.door     = door;
//	}
}
