package com.domain.lecture.ch06;

public class ThirdCalculator {

	// 필드
	double a;
	double b;
	
	// 생성자
	
	// 메소드
	// 다형성, 오버로드
	double areaRectangle(double a) {
		double result1 = a * a;
		return result1;
	}
	
	double areaRectangle(double a, double b) {
		double result2 = a * b;
		return result2;
	}
}
