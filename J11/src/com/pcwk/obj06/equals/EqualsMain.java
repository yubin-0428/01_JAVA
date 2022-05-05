package com.pcwk.obj06.equals;

public class EqualsMain {

	public static void main(String[] args) {
		Value v01=new Value(11);
		Value v02=new Value(11); 
		
		System.out.println(v01);//com.pcwk.obj06.equals.Value@15db9742
		System.out.println(v02);//com.pcwk.obj06.equals.Value@6d06d69c
		
		//Object equals v01 == v02
		if(v01.equals(v02)) {//같다.
			System.out.println("같다");
		}else {//다르다
			System.out.println("다르다");
		}
		
		//주소번지가 같게 할당
		v01 = v02;
		
		System.out.println(v01);
		System.out.println(v02);
		
		if(v01.equals(v02)) {//같다.
			System.out.println("같다");
		}else {//다르다
			System.out.println("다르다");
		}		
	}

}
//com.pcwk.obj06.equals.Value@15db9742
//com.pcwk.obj06.equals.Value@6d06d69c
//다르다
//com.pcwk.obj06.equals.Value@6d06d69c
//com.pcwk.obj06.equals.Value@6d06d69c
//같다

