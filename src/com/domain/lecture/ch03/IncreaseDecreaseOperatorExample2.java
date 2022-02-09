package com.domain.lecture.ch03;

public class IncreaseDecreaseOperatorExample2 {

	public static void main(String[] args) {
		
//		++ : 1증가
//		-- : 1감소
//		++x: 피연산자를 1 증가시키고 다른 연산 수행
//		x++: 다른 연산 수행 후 피연산자 1 증가
//		다른연산자가 없으면 앞에 있으나 뒤에 있으나 결과는 동일
		
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("---------------------------");
		x++; //x=11
		++x; //x=12
		System.out.println("x=" + x); // x=12
		
		System.out.println("---------------------------");
		y--; //y=9
		--y; //y=8
		System.out.println("y=" + y); //y=8 
		
		System.out.println("---------------------------");
		z = x++; //x=12 -> z=12 -> x=13 / z에 x를 넣은다음에 x를 +함
		System.out.println("z=" + z); //z=12 
		System.out.println("x=" + x); //x=13
		
		System.out.println("---------------------------");
		z = ++x; //x=13 -> x=14 -> z=14 / x를 +한 다음에 z에 넣음
		System.out.println("z=" + z); //z=14
		System.out.println("x=" + x); //x=14 
		
		System.out.println("---------------------------");
		z = ++x + y++ ; // x=14 + y=8 -> x=15 + y=8 -> z=23 x=15 y=9
		System.out.println("z=" + z); //z=23
		System.out.println("x=" + x); //x=15 
		System.out.println("y=" + y); //x=9 



		
	}

}
