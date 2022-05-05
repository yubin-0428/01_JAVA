/**
* <pre>
* com.pcwk.ex02.datainputstream
* Class Name : DataOutputStreamEx02.java
* Description:
* Author: ITSC
* Since: 2022/03/02
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/03/02 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.ex02.datainputstream;

import java.io.*;

public class DataOutputStreamEx02 {

	//
	//sum,평균
	public static void main(String[] args) {
		int[] score={100,90,95,85,50};
		
		try(FileOutputStream fos = new FileOutputStream("score.dat");
			DataOutputStream dos = new DataOutputStream(fos);) {
			
			for(int i :score) {
				dos.writeInt(i);
			}
		
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("score.dat 생성");

	}

}
