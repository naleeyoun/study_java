package com.domain.lecture.ch06;

public class StudentExample {

	public static void main(String[] args) {

//		객체 생성
		
		Student student = new Student();
		
		Student student1;
		student1 = new Student();
//		int a;
//		int b = 1; ->요거한거임
		
//		객체는 참조형 변수라서 아래처럼 하면 알 수 없는 주소값이 보여진다.
		System.out.println("student: " + student);
		System.out.println("student1: " + student1);
		
	}

}
