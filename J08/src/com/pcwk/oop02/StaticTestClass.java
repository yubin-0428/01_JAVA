package com.pcwk.oop02;

public class StaticTestClass {
    int iv ;      //인스턴스 변수
    static int cv;//클래스 변수
    
    void instanceMethod() {
    	System.out.println(iv);//인스턴스 변수 사용 가능
    	System.out.println(cv);//클래스 변수를 사용 가능
    }
    
    static void staticMethod() {
    	//Cannot make a static reference to the non-static field iv
    	//System.out.println(iv);//인스턴스 변수 사용 불가
    	System.out.println(cv);//클래스 변수를 사용 가능
    	
    }
    
}
