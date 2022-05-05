package com.pcwk.obj04.clone;

//implements Cloneable 없으면
//예외 발생!
public class Point implements Cloneable {
	int x,y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x="+x+", y="+y;
	}
	
	public Object clone() {
		Object obj = null;
		
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return obj;
	}
}
