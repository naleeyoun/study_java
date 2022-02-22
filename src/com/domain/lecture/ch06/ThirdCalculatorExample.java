package com.domain.lecture.ch06;

public class ThirdCalculatorExample {

	public static void main(String[] args) {

		ThirdCalculator thirdCalculator = new ThirdCalculator();
		
		double a = 3.0;
		double b = 2.0;
		
		
		//다형성, 오버로드
		double result1 = thirdCalculator.areaRectangle(a); // 정사각형
		
		double result2 = thirdCalculator.areaRectangle(a, b); // 직사각형
		
		System.out.println("사각형의 넓이: " + result1);
		System.out.println("사각형의 넓이: " + result2);
	}

}
