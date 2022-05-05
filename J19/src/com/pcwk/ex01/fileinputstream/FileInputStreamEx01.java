/**
* <pre>
* com.pcwk.ex01.fileinputstream
* Class Name : FileInputStreamEx01.java
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
import java.io.IOException;

public class FileInputStreamEx01 {

	/**
	 * file읽기: FileInputStream
	 * C:\DCOM_20220127\01_JAVA\workspace\J19\src\com\pcwk\ex01\fileinputstream\input.txt
	 * C:\\DCOM_20220127\\01_JAVA\\workspace\\J19\\src\\com\\pcwk\\ex01\\fileinputstream\\input.txt
	 * C:\\DCOM_20220127\\01_JAVA\\workspace\\J19\\src\\com\\pcwk\\ex01\\fileinputstream\\FileInputStreamEx01.java
	 */
	public static void main(String[] args) {
		
		String filePath = args[0];
		System.out.println("filePath:"+filePath);

		FileInputStream  fis= null;
		try {
			fis = new FileInputStream(filePath);
			
			int data = 0;
			while( (data=fis.read()) !=-1) {
				char ch=(char) data;
				System.out.print(ch);
			}
					
			
			
		}catch(IOException e) {
			
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
