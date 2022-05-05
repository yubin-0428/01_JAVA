/**
* <pre>
* com.pcwk.collection.ex04.hashmap
* Class Name : MameberHashMap.java
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

import java.util.*;
import com.pcwk.collection.ex03.hashmap.Member;

public class MameberHashMap {

	private HashMap<Integer, Member>  memberHash;
	
	public MameberHashMap() {
		memberHash = new HashMap<>();
	}
	
	
	//추가
	public void addMember(Member member) {
		memberHash.put(member.getMemberId(), member);
	}
	
	//삭제
	public boolean removeMebmer(int memberId) {
		//key가 있는지 확인
		if(memberHash.containsKey(memberId)) {
			memberHash.remove(memberId);//key에 해당되는 객체 삭제
			return true;
		}
		
		System.out.println(memberId+"존재 하지 않습니다.");
		return false;
		
	}
	
	//map에 있는 모든 데이터 출력
	public void showAllMember() {
		//key값을 받기
		Set<Integer> keySet = memberHash.keySet();
		
		Iterator<Integer> iter = keySet.iterator();
		while(iter.hasNext()) {
			int key = iter.next();
			Member member = memberHash.get(key);
			System.out.println(key+", "+member.toString());
		}
		
		
		
		
	}
	
	
	
	
	
	
	
}
