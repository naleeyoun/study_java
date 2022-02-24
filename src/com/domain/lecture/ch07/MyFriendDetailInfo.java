package com.domain.lecture.ch07;

public class MyFriendDetailInfo extends MyFriendInfo {
// 자식
	
	//필드
	String address;	//이름
	String phone;		//나이
	
	//생성자
	private String strAddress = "strAdderss";
	private String strPhone = "strPhone";
	
	//메소드
	

	public String getStrAddress(String strAddress) {
		return strAddress;
	}
	
	public void setStrAddress(String strAddress) {
		this.strAddress =address;
	}
	
	
	public String getStrPhone(String strPhone) {
		return strPhone;
	}
	
	public void setStrPhone(String strPhone) {
		this.strPhone =strPhone;
	}
}
