/**
* <pre>
* com.pcwk.exception.ex06.throws9
* Class Name : ThrowsMain.java
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
package com.pcwk.exception.ex06.throws9;

import com.pcwk.cmn.LoggerManager;

/**
 * @author ITSC
 *
 */
public class ThrowsMain02 implements LoggerManager {

//	예외던지기(throws)																
//	예외던지기란 예외가 발생했을 경우 현재 메서드가 예외를 처리하지 않고															
//	자신을 호출한 쪽으로 예외 처리에 대한 책임을 넘기는 것.		
	
	public static void methodA() throws Exception{
		LOG.debug("methodA()");
		Exception e=new Exception("메서드A 예외 발생!");
		throw e;
	}
	//예외던지기 : 예외 회피!
	public static void main(String[] args)  {
		try {
			methodA();
		} catch (Exception e) {
			LOG.debug("main() 예외처리");
			LOG.debug(e.getMessage());
			
		}
	}

}
//- methodA()
//- main() 예외처리
//- 메서드A 예외 발생!