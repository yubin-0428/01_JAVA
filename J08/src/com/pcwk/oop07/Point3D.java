package com.pcwk.oop07;

public class Point3D extends Point {
	int z;
//Implicit super constructor Point() is undefined for 
//default constructor. Must define an explicit constructor
	public Point3D(int x, int y, int z) {
		super(x,y);
		//super() 자동으로 호출
		//Constructor call must be the first statement in a constructor
		
		
		//this.x = x;
		//this.y = y;
		this.z = z;
		
	}
	
	@Override//아버지에 getLocation() 제정의
	public String getLocation() {
		return "x:"+x+", y:"+y+", z:"+z;
	}
	
	
	
}
