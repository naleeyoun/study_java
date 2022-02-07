package com.domain.lecture.ch02;

public class PromotionExample {

	public static void main(String[] args) {
		
		// 작은 형이 큰형으로 변환은 문제가 발생하지 않는다.
		// 하지만 형놈이 작은형으로 변환이 되려면 문제가 생긴다. (비정상적으로 된다)
		
		// byte < short < int < long
		// float < double
		
		byte byteValue =10;
		System.out.println("byteValue: " + byteValue);
		
		int intValue = byteValue;
		System.out.println("byteValue: " + byteValue);
		
		char charValue = '가';
		
		intValue = charValue;
		System.out.println("가의 유니코드=" + intValue);
		
		intValue =500;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		intValue =200;
		long floatValue = intValue;
		System.out.println("longValue: " + floatValue);
		
		intValue =200;
		long doubleValue = intValue;
		System.out.println("longValue: " + doubleValue);
		

		
//		  intValue=500; long longValue=intValue; 
//		  System.out.println(longValue);
//		  
//		  intValue=200; double doubleValue= intValue; 
//		  System.out.println(doubleValue);
		 

	}

}
