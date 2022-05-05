/**
* <pre>
* com.pcwk.ex02.datainputstream
* Class Name : DataInputStreamEx03.java
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

public class DataInputStreamEx03 {


	public static void main(String[] args) {
		int sum = 0;
		int score = 0;
		
		
		try(FileInputStream fis = new FileInputStream("score.dat");
			DataInputStream dis=new DataInputStream(fis);
				) {
			
			while(true) {
				score = dis.readInt();
				System.out.println(score);
				sum += score;
			}
			
		} catch(EOFException e) {//더 이상 읽을 데이터가 없으면 EOFException발생 시킨다.
			System.out.println("===========================");
			System.out.println("=sum="+sum);
			System.out.println("===========================");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		


	}

}
//100
//90
//95
//85
//50
//===========================
//=sum=420
//===========================
