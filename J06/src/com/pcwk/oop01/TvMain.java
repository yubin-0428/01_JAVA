package com.pcwk.oop01;

public class TvMain {

	public static void main(String[] args) {
		Tv t; //Tv 인스턴스를 참조하기 위한 변수 t
		t = new Tv();//Tv 인스턴스를 생성
		
		System.out.println("전원: "+t.power);
		t.power();//전원 켜기
		System.out.println("전원: "+t.power);
		
		t.channel = 3;//tvN
		t.volume  = 11;
		
		System.out.println("현 채널: "+t.channel);
		System.out.println("볼륨: "+t.volume);

		//메서드 호출
		t.channelUp();
		System.out.println("현 채널: "+t.channel);
		
		//전원off
		t.power();
		System.out.println("전원: "+t.power);
		
		
		
	}

}
