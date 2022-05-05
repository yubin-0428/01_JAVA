package com.pcwk.oop08;

import static com.pcwk.oop08.Card.HEIGHT;
import static com.pcwk.oop08.Card.WIDTH;

//import java.lang.*;
//jvm이 넣어줌!
import static java.lang.System.out;
import static java.lang.Math.*;

public class StaticImportMain {

	public static void main(String[] args) {
		System.out.println("Card.WIDTH:"+Card.WIDTH);
		System.out.println("WIDTH:"+WIDTH);
		
		//System.out.println -> out.println
		System.out.println();
		
		//Math.random() -> random()
		out.println(random());
		
	}

}
