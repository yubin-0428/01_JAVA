package com.pcwk.oop11.abstracted;

/**
 * Pokemon 추상클래스
 * @author ITSC
 *
 */
public abstract class Pokemon {
	String name;
	
	abstract void attack();//공격 추상 메서드
	abstract void sound(); //소리 추상 메서드
	
	public String getName() {
		return name;
	}
	
	
}
