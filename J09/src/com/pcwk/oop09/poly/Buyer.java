package com.pcwk.oop09.poly;

public class Buyer {
	int money = 10000; //소유금액
	int bonusPoint = 0;//보너스 점수
	
	Product[] item=new Product[10];//Tv,Computer,Audio;
	int i = 0; //배열에 사용될 counter
	
	//구매 메서드
	void buy(Product p) {
		//잔고확인
		if(money<p.price) {
			System.out.println("잔고를 확인 하세요.");
			return;
		}
		
		money-=p.price; //가진 돈에서 제품 가격을 뺀다.
		bonusPoint+=p.bonusPoint;//제품의 보너스 점수 추가
		item[i++] = p;  //제품을 Product[]에 저장
		System.out.println(p.toString() +"을/를 구입하셨습니다.");
	}
	
	//구매 제품에 대한 요약 정보 
	void summary() {
		int sum=0;//구매 금액 합계
		String itemList= "";//구매 목록
		
		for(int i=0;i<item.length;i++) {
			if(null == item[i]) {//객체가 null이면 for문 종료
				break;
			}
			
			sum += item[i].price;
			itemList +=item[i].toString()+",";	
		}
		
		System.out.println("구매 총 금액:"+sum);
		System.out.println("구입 제품 목록: "+itemList);
		System.out.println("보너스 점수: "+this.bonusPoint);
		System.out.println("잔액: "+this.money);
		
		
	}
	
}
//Tv을/를 구입하셨습니다.
//MacBook Pro을/를 구입하셨습니다.
//구매 총 금액:9620
//구입 제품 목록: Tv,MacBook Pro,
//보너스 점수: 962
//잔액: 380










