/**
* <pre>
* com.pcwk.util.ex02.date
* Class Name : DateEx03SimpleDateForamt.java
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
package com.pcwk.util.ex02.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx03SimpleDateForamt {

	public static void main(String[] args) {

		SimpleDateFormat sdf01 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		//MM-dd-yyyy
		
		SimpleDateFormat sdf02=  new SimpleDateFormat("MM-dd-yyyy");
		//yy년 MM월 dd일 E요일
		SimpleDateFormat sdf03=  new SimpleDateFormat("yy년 MM월 dd일 E요일");
		
		
		Date today = new Date();

		System.out.println("yyyy-MM-dd HH:mm:ss.SSS:"+sdf01.format(today));
		System.out.println("MM-dd-yyyy:"+sdf02.format(today));
		System.out.println(sdf03.format(today));
	}

}
