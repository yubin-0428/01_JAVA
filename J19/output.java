/**
* <pre>
* com.pcwk.ex01.fileinputstream
* Class Name : FileInputStreamEx02.java
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
package com.pcwk.ex01.fileinputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx02 {

	
	public static void main(String[] args) {
	
		String filePath = "C:\\DCOM_20220127\\01_JAVA\\workspace\\J19\\src\\com\\pcwk\\ex01\\fileinputstream\\FileInputStreamEx02.java";

		//try-with-resource
		
		
//		try(FileInputStream  fis=new FileInputStream(filePath);
//			FileOutputStream fos=new FileOutputStream("output.java");) {
		
		FileInputStream  fis = null;
		FileOutputStream fos = null;
		
		try {
			fis=new FileInputStream(filePath);
			fos=new FileOutputStream("output.java");
			
			
			int data  = 0;
			while( (data=fis.read()) !=-1) {
				char ch = (char) data;
				System.out.print(ch);
				//--FileInputStream--------------------------
				
				fos.write(data);
			}
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			
		}
		System.out.println("프로그램 종료!");
		
		
	}

}
