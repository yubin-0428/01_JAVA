/**
* <pre>
* com.pcwk.exception.ex07.userexception
* Class Name : UserExceptionMain.java
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
package com.pcwk.exception.ex07.userexception;

import com.pcwk.cmn.LoggerManager;

/**
 * @author ITSC
 *
 */
public class UserExceptionMain implements LoggerManager {

	public static void ticketing(int age) throws AgeException{
		if(age<0) {
			LOG.debug("ticketing(): "+age);
			throw new AgeException("나이를 확인 하세요.\n나이는 >0");
		}
	}
	
	
	public static void main(String[] args) {
		try {
			ticketing(-9);
		} catch (AgeException e) {
			LOG.debug("main AgeException");
			LOG.debug("getMessage: "+e.getMessage());
			//e.printStackTrace();
		}

	}

}
//- ticketing(): -9
//- main AgeException
//- getMessage: 나이를 확인 하세요.
//              나이는 >0
