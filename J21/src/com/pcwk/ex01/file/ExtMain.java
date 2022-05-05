/**
* <pre>
* com.pcwk.ex01.file
* Class Name : ExtMain.java
* Description:
* Author: ITSC
* Since: 2022/03/04
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/03/04 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.ex01.file;

/**
 * @author ITSC
 *
 */
public class ExtMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String fileName ="FileE.java";
		int idx = fileName.lastIndexOf(".");
		System.out.println(idx);
		
		String ext = fileName.substring(idx+1);
		System.out.println(ext);

	}

}
