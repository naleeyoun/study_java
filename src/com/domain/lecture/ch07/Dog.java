package com.domain.lecture.ch07;

public class Dog extends Animal{
	
	//생성자
	public Dog() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
