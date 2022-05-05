/**
* <pre>
* com.pcwk.exception.ex03.multiblock
* Class Name : MultiBlockExceptionMain.java
* Description: JDK 1.7부터 여러 catch블럭을 | 기호를 이요해서, 하나의 catch블럭으로 합칠수 있다.																		
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
package com.pcwk.exception.ex03.multiblock;

import com.pcwk.cmn.LoggerManager;

public class MultiBlockExceptionMain implements LoggerManager{

//JDK 1.7부터 여러 catch블럭을 | 기호를 이요해서, 하나의 catch블럭으로 합칠수 있다.																		
	public static void main(String[] args) {
		LOG.debug("1");
		LOG.debug("2");
		int[] intArray= {1,2,0,3};
		try {
			LOG.debug("3");
			LOG.debug(1/intArray[4]);//예외발생
			LOG.debug("4");//수행되지 않음
			
		}catch(ArithmeticException e) {//예상되는 예외
			LOG.debug("5 ArithmeticException");
		}catch(ArrayIndexOutOfBoundsException e) {
			LOG.debug("5-1 ArrayIndexOutOfBoundsException");
	    }catch(Exception e) {//그외 모든 예외
			LOG.debug("6 Exception");
		}finally {
			LOG.debug("7 finally");
		}
		
		LOG.debug("8 종료");

	}

}
//2022-02-21 10:22:40,753 DEBUG [main] cmn.LoggerManager (MultiBlockExceptionMain.java:25)     - 1
//2022-02-21 10:22:40,754 DEBUG [main] cmn.LoggerManager (MultiBlockExceptionMain.java:26)     - 2
//2022-02-21 10:22:40,754 DEBUG [main] cmn.LoggerManager (MultiBlockExceptionMain.java:29)     - 3
//2022-02-21 10:22:40,755 DEBUG [main] cmn.LoggerManager (MultiBlockExceptionMain.java:36)     - 5-1 ArrayIndexOutOfBoundsException
//2022-02-21 10:22:40,755 DEBUG [main] cmn.LoggerManager (MultiBlockExceptionMain.java:40)     - 7 finally
//2022-02-21 10:22:40,755 DEBUG [main] cmn.LoggerManager (MultiBlockExceptionMain.java:43)     - 8 종료

