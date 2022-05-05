package com.pcwk.ed01;

public class EX07_Operator {

	public static void main(String[] args) {
//		대입 연산자											
//		대입 연산자는 값을 할당하는 데 쓰이는 연산자로서, 										
//		연산을 간결하게 표현 가능.										
		int a = 3;
		int b = 5;
		
		b = a;
		System.out.println("b="+b);//b=3
		
		a+=1;//a=a+1
		System.out.println("a+=1 :"+a);
        
		a = 3;
		a/=2;//a=a/2;
		System.out.println("a/=2 :"+ a );
		
		a = 3; 
		a*= 2;//a=a*2;
		System.out.println("a*= 2 :"+(a));
	}

}
