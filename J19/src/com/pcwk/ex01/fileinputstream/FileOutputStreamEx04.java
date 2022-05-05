/**
* <pre>
* com.pcwk.ex01.fileinputstream
* Class Name : FileOutputStreamEx04.java
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

import java.io.*;

public class FileOutputStreamEx04 {


	public static void main(String[] args) {
		//기존 파일에 내용을 추가
		//new FileOutputStream("output02.txt",true)
		try(FileOutputStream fos=new FileOutputStream("output02.txt",true);) {
			
			fos.write(97);//a
			fos.write(98);//b
			fos.write(99);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("종료");

	}

}
