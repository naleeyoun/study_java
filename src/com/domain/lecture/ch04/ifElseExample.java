package com.domain.lecture.ch04;

public class ifElseExample {

	public static void main(String[] args) {
		
		
		int score = 85;
		
		if(score >= 90) {	//false
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} else {	//else에는 조건문이 절대 안들어간다.
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}

	}

}
