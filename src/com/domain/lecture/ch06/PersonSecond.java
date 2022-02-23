package com.domain.lecture.ch06;

public class PersonSecond {

	final String nation = "Korea"; // 1.초기화
	final String ssn;
	String name;
	
	
	// 2. 초기화: 생성자. final형은 생성자에서만 초기화 가능하다. return이 없다.
	public PersonSecond(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	
}
}
