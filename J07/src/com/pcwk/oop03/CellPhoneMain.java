package com.pcwk.oop03;

public class CellPhoneMain {

	public static void main(String[] args) {
		//Default생성자
		CellPhone celPhone=new CellPhone();

		//인자 3개 생성자
		CellPhone cel02 = new CellPhone("iPhone13", "Silver", 512);
		
		System.out.println(cel02.model);
		System.out.println(cel02.color);
		System.out.println(cel02.capacity);
	}

}
//iPhone13
//Silver
//512
