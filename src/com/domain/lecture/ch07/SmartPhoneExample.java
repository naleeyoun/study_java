package com.domain.lecture.ch07;

public class SmartPhoneExample {

	public static void main(String[] args) {

//		Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("윤이나");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}

}
