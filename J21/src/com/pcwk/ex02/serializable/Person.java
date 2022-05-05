/**
* <pre>
* com.pcwk.ex02.serializable
* Class Name : Person.java
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

import java.io.Serializable;

/**
 * @author ITSC
 *
 */
public class Person implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 2160892108411219765L;

	/**
	 *Server/Client 클래스의 동일성 check
	 */

	String name;
	
	//직열화 대상에서 제거
	transient String job;
	
	public Person() {}

	public Person(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + "]";
	}
	
	
}
