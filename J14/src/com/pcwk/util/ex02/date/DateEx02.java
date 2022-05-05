/**
* <pre>
* com.pcwk.util.ex02.date
* Class Name : DateEx02.java
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

import java.util.Calendar;
import java.util.Date;

public class DateEx02 {

//	Date와 Calendar간의 변환										
//	
//	Calendar  -> Date									
//	ex)									
//		Calendar cal = Calendar.getInstance();								
//		Date d =new Date(cal.getTimeInMills());								
//										
//	Date  -> Calendar									
//	ex)									
//		Date d =new Date();								
//		Calendar cal = Calendar.getInstance();								
//		cal.setTime(d);								

	public static void main(String[] args) {
        
		//Calendar  -> Date			
		Calendar cal=Calendar.getInstance();
		Date d01 = new Date(cal.getTimeInMillis());
		
		System.out.println("d01:"+d01);
		
        //Date  -> Calendar		
		Date d02=new Date();
		Calendar cal02=Calendar.getInstance();
		cal02.setTime(d02);
	}

}
