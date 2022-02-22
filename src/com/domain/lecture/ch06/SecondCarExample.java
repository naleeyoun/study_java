package com.domain.lecture.ch06;

public class SecondCarExample {

	public static void main(String[] args) {

		
		
		SecondCar secondCar = new SecondCar();
		
		secondCar.company = "현대자동차";
		secondCar.model = "캐스퍼";
		secondCar.color = "Red";
		secondCar.maxSpeed = 250;
		
		System.out.println("company: " + secondCar.company);
		System.out.println("model: " + secondCar.model);
		System.out.println("color: " + secondCar.color);
		System.out.println("maxSpeed: " + secondCar.maxSpeed);
		
		SecondCar secondCar2 = new SecondCar("캐스퍼");
		
		System.out.println("-----------------------");
		System.out.println("company: " + secondCar2.company);
		System.out.println("model: " + secondCar2.model);
		System.out.println("color: " + secondCar2.color);
		System.out.println("maxSpeed: " + secondCar2.maxSpeed);
		
		SecondCar secondCar3 = new SecondCar("캐스퍼", "Red");
		
		System.out.println("-----------------------");
		System.out.println("company: " + secondCar3.company);
		System.out.println("model: " + secondCar3.model);
		System.out.println("color: " + secondCar3.color);
		System.out.println("maxSpeed: " + secondCar3.maxSpeed);
		
		SecondCar secondCar4 = new SecondCar("캐스퍼", "Red", 250);
		
		System.out.println("-----------------------");
		System.out.println("company: " + secondCar4.company);
		System.out.println("model: " + secondCar4.model);
		System.out.println("color: " + secondCar4.color);
		System.out.println("maxSpeed: " + secondCar4.maxSpeed);
		
		
	}

}
