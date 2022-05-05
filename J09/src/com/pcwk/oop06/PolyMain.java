package com.pcwk.oop06;

public class PolyMain {

	public static void main(String[] args) {
		Lion lion=new Lion();//Lion인스턴스 생성
		ZooKeeper  zooK=new ZooKeeper();
		
		zooK.feed(lion);

	}

}
