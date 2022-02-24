package com.domain.lecture.ch07;

public class MyFriendInfo{
// 부모
	
	//필드
	String name;	//이름
	String age;		//나이
	
	//생성자
	private String strName = "strName";
	private String strAge = "strAge";
	
	//메소드
	

	public String getStrName(String strName) {
		return strName;
	}
	
	public void setStrName(String strName) {
		this.strName= strName;

	}
	
	public String getStrAge(String strAge) {
		return strAge;
	}
	
	public void setStrAge(String strAge) {
		this.strAge =strAge;
	}
}
