package com.domain.lecture.ch07;

public class StudentExample {

	public static void main(String[] args) {
		
		Student student = new Student("yina", "1234-1234", 21); 
		
		System.out.println("name: " + student.name);
		System.out.println("ssn: " + student.ssn);
		System.out.println("studentNo : " + student.studentNo);
		
		Student student2 = new Student("yina2", "1234-1234"); 
		
		System.out.println("name: " + student2.name);
		System.out.println("ssn: " + student2.ssn);
		System.out.println("studentNo : " + student2.studentNo);
		
	}

}
