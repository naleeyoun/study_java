package com.domain.lecture.ch03;

import java.lang.management.OperatingSystemMXBean;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		
		int score = 85;
		
//		char grade = (score > 90 ? 'A' : 'B');	//참 : A, 거짓 : B
		char grade = (score > 90 ? 'A' : (score > 80 ? 'B' : 'C'));	//참 : A / 참 : B, 거짓 : C
		
		System.out.println("grade: " + grade);

	}
}
