package com.domain.lecture.ch06;

public class PersonExample {
	public static void main(String[] args) {

	Person person = new Person("123456-2134567", "전지현");
	
	System.out.println(person.nation);
	System.out.println(person.ssn);
	System.out.println(person.name);
	
	person.name = "고소영";
	
	}
}
