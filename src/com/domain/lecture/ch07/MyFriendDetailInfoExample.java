package com.domain.lecture.ch07;

public class MyFriendDetailInfoExample {

	public static void main(String[] args) {

		MyFriendDetailInfo myFriendDetailInfo = new MyFriendDetailInfo();
		
		myFriendDetailInfo.setStrName("이순신");
		myFriendDetailInfo.setStrAge("100");
		myFriendDetailInfo.setStrAddress("성균관");
		myFriendDetailInfo.setStrPhone("010-1000-8888");
		
		System.out.println("이름: " + myFriendDetailInfo.getStrName());
		System.out.println("나이: " + myFriendDetailInfo.getStrAge());
		System.out.println("주소: " + myFriendDetailInfo.getStrAddress());
		System.out.println("전화: " + myFriendDetailInfo.getStrPhone());
		
	}

}
