package com.domain.lecture.ch03;

public class StringEqualsExample {

	public static void main(String[] args) {

		String str1 = "윤이나";
		String str2 = "윤이나";
		String str3 = new String("윤이나");
		
		boolean result1 = (str1 == str2);
		System.out.println("result1=" + result1); //true
		
		boolean result2 = (str1 == str3);
		System.out.println("result2=" + result2); //false
		
		System.out.println("str1.equals(str2): " + str1.equals(str2)); // == (x) true
		System.out.println("str1.equals(str3): " + str1.equals(str3)); // == (x) true
		
	
		
	}

}
