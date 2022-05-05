package com.pcwk.oop04;

public class CardMain extends Card {
    //Cannot override the final method from Card
//	public void disp() {
//		
//	}
	
	public static void main(String[] args) {
		Card card=new Card("Heart",10);
		//card.NUMBER = 1;
		//상수는 값을 설정하면 값 변경 불가.
		
		System.out.println(card.toString());

	}

}
