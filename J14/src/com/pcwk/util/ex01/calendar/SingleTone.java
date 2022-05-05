/**
* <pre>
* com.pcwk.util.ex01.calendar
* Class Name : SingleTone.java
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
package com.pcwk.util.ex01.calendar;

/**
 * @author ITSC
 *
 */
public class SingleTone {

    private static SingleTone instance ;
    
    private SingleTone() {
        // 생성자는 외부에서 호출못하게 private 으로 지정해야 한다.
    }

    public static SingleTone getInstance() {
        if (instance == null) { 
			instance = new SingleTone();
		}

        return instance;
    }

    public void say() {
        System.out.println("hi, there");
    }
}
