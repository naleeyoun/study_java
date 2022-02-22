package com.domain.lecture.ch06;

public class SecondCar {

		String company = "현대자동차";
		String model = "";
		String color = "";
		int maxSpeed = 0;
		
//		기본생성자
		public SecondCar() {
			
		}

//		데이터 받고싶음
		public SecondCar(String model) {
			this.model = model;
			
		}
		
		
		public SecondCar(String model, String color) {
			this.model = model;
			this.color = color;
		}
		
		public SecondCar(String model, String color, int maxSpeed) {
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;
			
		}
		
	
}
