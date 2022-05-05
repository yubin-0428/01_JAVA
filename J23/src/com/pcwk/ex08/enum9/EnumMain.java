package com.pcwk.ex08.enum9;

import com.pcwk.ex08.enum9.Direction;

public class EnumMain {

	public static void main(String[] args) {
		Direction[] directionArr= Direction.values();
		for(Direction d: directionArr) {
			System.out.println(d.name()+","+d.getValue());
		}

	}

}
//EAST,1
//SOUTH,5
//WEST,-1
//NORTH,10
