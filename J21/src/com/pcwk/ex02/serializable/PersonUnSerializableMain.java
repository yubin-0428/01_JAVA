/**
* <pre>
* com.pcwk.ex02.serializable
* Class Name : PersonUnSerializableMain.java
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
package com.pcwk.ex02.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.imageio.stream.FileImageInputStream;

/**
 * @author ITSC
 *
 */
public class PersonUnSerializableMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//객체 역직열화
		try(FileInputStream fis=new FileInputStream("serial.ser");
			ObjectInputStream  ois=new ObjectInputStream(fis);	
				) {
			Person person01=(Person) ois.readObject();
			Person person02=(Person) ois.readObject();
			
			System.out.println("person01:"+person01);
			System.out.println("person02:"+person02);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("완료");
	}

}
