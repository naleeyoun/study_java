package com.domain.lecture.ch03;

public class DenyLogicOpreatorExampel {

	public static void main(String[] args) {
		
		boolean play = true;

		System.out.println(play); //true
		
		play = !play; //false
		System.out.println(play);
		
		play = !play; //true
		System.out.println(play);

	}

}
