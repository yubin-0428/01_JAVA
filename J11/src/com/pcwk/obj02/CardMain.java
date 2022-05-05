package com.pcwk.obj02;

public class CardMain {

	public static void main(String[] args) {
		Card c01=new Card();
		Card c02=new Card("SPADE",10);
		
		System.out.println(c01);//Card [kind=SPADE, number=1]
		System.out.println(c02.toString());//Card [kind=SPADE, number=10]
	}

}
