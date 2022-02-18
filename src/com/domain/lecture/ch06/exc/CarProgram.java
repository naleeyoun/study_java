package com.domain.lecture.ch06.exc;

public class CarProgram {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		
		Car car = new Car();
		
		Car car2;
		car2 = new Car();
		
//		객체 접근 연산자
//		car.company;
		
		System.out.println("car.company: " + car.company);
		
		car.color = car.a + car.b;
		
		System.out.println("car.c: " + car.c);
		
		car.c = car.speedUp(10);
		
		System.out.println("car.c: " + car.c);
		
	}

}
