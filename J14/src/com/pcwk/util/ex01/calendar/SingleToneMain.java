/**
* <pre>
* com.pcwk.util.ex01.calendar
* Class Name : SingleToneMain.java
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
package com.pcwk.util.ex01.calendar;

/**
 * @author ITSC
 *
 */
public class SingleToneMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SingleTone  st01=SingleTone.getInstance();
		SingleTone  st02=SingleTone.getInstance();
		
		System.out.println("st01:"+st01);
		System.out.println("st02:"+st02);
	}

}
