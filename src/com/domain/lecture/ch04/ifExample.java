package com.domain.lecture.ch04;

public class ifExample {

	public static void main(String[] args) {


		int score = 91;
		
		if(score > 90) { //true
			System.out.println("점수가 90 보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		
		if(score < 90) //false
			System.out.println("점수가 90보다 작습니다.");
		// 블럭을 구성하지 않으면 바로 다음줄까지만 블럭내의 문장으로 이해하고 실행시킨다.		
			System.out.println("등급은 B 입니다."); //얘는 블럭 구성 안했으므로 if문에 포함이 안된다.

	}

}
