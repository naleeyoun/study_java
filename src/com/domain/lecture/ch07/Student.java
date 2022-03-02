package com.domain.lecture.ch07;

//자식
public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); //부모클래스에 생성자가 있으므로 무!조!건! 부모 생성자호출
		this.studentNo = studentNo;
	}
	
	public Student(String name, String ssn) {
		super(name, ssn); 
	}

}
