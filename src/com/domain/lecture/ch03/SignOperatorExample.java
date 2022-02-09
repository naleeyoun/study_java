package com.domain.lecture.ch03;

public class SignOperatorExample {

	public static void main(String[] args) {
		
//		+ : 부호 그대로 유지
//		- : 부호 변경
		
		int x = -100;
		
		int result1 = +x;
		int result2 = -x;
		
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		short s = 100;
//		short result3 = -s; // s앞에 -로 연산을 해서 int형으로 자동으로 바뀌므로 int->short로 변환이 안돼서 에러남
		int result3 = -s;
		System.out.println("result3=" + result3);

	}

}
