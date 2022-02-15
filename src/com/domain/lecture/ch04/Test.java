package com.domain.lecture.ch04;

public class Test {

	public static void main(String[] args) {

		
//		구구단 2단~9단
//		짝수의 합 , 홀수의 합
		
		int result =0;
		int evenNumber = 0;
		int oddNumber = 0;
		
		for (int i=2; i<10; i++) {
			System.out.println("★" + i + "단" + "★");
			for(int j=1; j<10; j++) {
				result = i*j;
				System.out.println(i + "x" + j + "=" + result);

				}
			System.out.println("-----------------");
			result2 += result;
			if (result%2 == 0) {
				println("짝수의 합은 ": result2 );
			} else {
				println("홀수의 합은 ": result2);
			}
		}
	}		
}