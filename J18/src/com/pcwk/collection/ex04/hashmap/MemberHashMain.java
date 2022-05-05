/**
* <pre>
* com.pcwk.collection.ex04.hashmap
* Class Name : MemberHashMain.java
* Description:
* Author: ITSC
* Since: 2022/02/28
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/02/28 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.collection.ex04.hashmap;

import com.pcwk.collection.ex03.hashmap.Member;

/**
 * @author ITSC
 *
 */
public class MemberHashMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//16개 map생성
		MameberHashMap memberMap=new MameberHashMap();
		
		Member member01=new Member(1,"오일남");
		Member member02=new Member(67,"강새벽");
		Member member03=new Member(101,"장덕수");
		Member member04=new Member(199,"알리압둘");
		Member member05=new Member(456,"성기훈");
		
		memberMap.addMember(member01);
		memberMap.addMember(member02);
		memberMap.addMember(member03);
		memberMap.addMember(member04);
		memberMap.addMember(member05);
		
		memberMap.addMember(member01);//오일남추가 (key 중복되지 않음!)
		//전체 출력
		memberMap.showAllMember();
		
		//삭제
		memberMap.removeMebmer(101);
		System.out.println("==================================================");
		//전체 출력
		memberMap.showAllMember();		
	}

}

//1, Member [memberId=1, memberName=오일남]
//67, Member [memberId=67, memberName=강새벽]
//101, Member [memberId=101, memberName=장덕수]
//199, Member [memberId=199, memberName=알리압둘]
//456, Member [memberId=456, memberName=성기훈]
//==================================================
//1, Member [memberId=1, memberName=오일남]
//67, Member [memberId=67, memberName=강새벽]
//199, Member [memberId=199, memberName=알리압둘]
//456, Member [memberId=456, memberName=성기훈]

