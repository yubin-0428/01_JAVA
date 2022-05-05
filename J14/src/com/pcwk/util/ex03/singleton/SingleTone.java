/**
* <pre>
* com.pcwk.util.ex03.singleton
* Class Name : SingleTone.java
* Description:
* Author: ITSC
* Since: 2022/02/22
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/02/22 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.util.ex03.singleton;

/**
 * @author ITSC
 *
 */
public class SingleTone {

	private static SingleTone singleTone; //
	
	//생성자는 private
	private SingleTone() {}
	
	//객체 생성용 static 메서드
	public static SingleTone getInstance() {
		
		if(null == singleTone) {
			singleTone = new SingleTone();
		}
		
		return singleTone;
	}
	
	
	
}
