package com.domain.lecture.ch03;

public class AssignmentOperatorExample {

	public static void main(String[] args) {

		int result = 0;
		
		result += 10;	//result = result + 10 = 10
		System.out.println("result: " +result);
		
		result -= 5;	//result = result - 5 = 5
		System.out.println("result: " +result);
		
		result *= 3;	//result = result * 3 = 15
		System.out.println("result: " +result);
		
		result /= 5;	//result = result / 5 = 3
		System.out.println("result: " +result);
		
		result %= 3;	//result = result % 3 = 0
		System.out.println("result: " +result);
		
	}

}
