package com.pcwk.oop05;

public class Tv {
	boolean power;//전원
	int channel;//채널
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		this.channel++;
	}
	
	void channelDown() {
		this.channel--;
	}
}
