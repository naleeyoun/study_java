package com.domain.lecture.ch06;

public class CarExample {

	public static void main(String[] args) {

		Car car = new Car();
		
		
//		객체접근연산자 (car.company)를 사용하여 
//		System.out.println("company: " + car.company);
//		System.out.println("model: " + car.model);
//		System.out.println("color: " + car.color);
//		System.out.println("maxSpeed: " + car.maxSpeed);
//		System.out.println("speed: " + car.speed);
//		
		car.speed = 100;
//		
//		System.out.println("speed: " + car.speed); //100
		
//		speed가 maxSpeed보다 속도가 높은지 낮은지를 출력해 주는 함수를 만들어서 출력하시오
		
		upDown(car.maxSpeed, car.speed);
		
	}
	
	public static void upDown(int maxSpeed, int speed) {
		
		if (speed > maxSpeed) {
			System.out.println("속도가 최고속도보다 높습니다. 주의하세요.");
		} else if ( speed < maxSpeed) {
			System.out.println("속도가 최고속도보다 낮습니다.");
		} else {
			System.out.println("속도가 최고속도와 동일합니다.");
		}
	}	

}
