package com.domain.lecture.ch10;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		
		
		try {
		Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다. ");
		}
	}
	
	public static void maine(String[] args) {		//일반 익셉션
		Class clazz = Class.forName("java.lang.String2");
	}

}
