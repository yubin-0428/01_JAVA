/**
* <pre>
* com.pcwk.exception.ex08.userexception
* Class Name : IDFormatExceptionMain.java
* Description:
* Author: ITSC
* Since: 2022/02/21
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/02/21 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.exception.ex08.userexception;

import com.pcwk.cmn.LoggerManager;

public class IDFormatExceptionMain implements LoggerManager {
	private String userID;
	
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatException {
		//id == null 예외 발생
		if(null == userID) {
			throw new IDFormatException("아이디는 null일수 없습니다.");
		}else if(userID.length()<8 || userID.length()> 20) {//!(8<=id<=20)
			throw new IDFormatException("아이디는 8자이상 20자 이하로 사용하세요.");
		}
		this.userID = userID;
	}
	
	public static void main(String[] args) {
		IDFormatExceptionMain  idFormat=new IDFormatExceptionMain();
		String id = "a123456";
		
		
		try {
			idFormat.setUserID(id);
		} catch (IDFormatException e) {
			LOG.debug("IDFormatException: "+e.getMessage());
			//e.printStackTrace();
		}
		
		LOG.debug("프로그램 종료");
		

	}

}
