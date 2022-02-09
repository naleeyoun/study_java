package com.domain.lecture.ch03;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		
//		++ : 1증가
//		-- : 1감소
//		++x: 피연산자를 1 증가시키고 다른 연산 수행
//		x++: 다른 연산 수행 후 피연산자 1 증가
//		다른연산자가 없으면 앞에 있으나 뒤에 있으나 결과는 동일
		
		int x = 10;
		int y = 10;
		int a = 0;
		int b = 0;
		
		++x;
		System.out.println(x); // x=11
		
		y++;
		System.out.println(y); // y=11

		a = ++x; 
		b = x++;
		
		System.out.println(a); // x=12
		System.out.println(b); // x=12
		System.out.println(x); // x=13
		
	}

}
