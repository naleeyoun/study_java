package com.domain.lecture.ch02;

public class Valiable {

	public static void main(String[] args) {

//		 변수 명명법
// 		첫글자 소문자 그리고 다음 문자열부터는 대문자
//		모든 변수명은 붙여서 사용

		
		String fullName = "yina Yun";
		String name = "Yina";
		
//		대소문자 구분함		
		int roomNumber = 1;
		int roomnumber = 2;
		
		System.out.println("roomNumber: " + roomNumber);
		System.out.println("roomNumber: " + roomnumber);
		
//		예약어는 사용 할 수 없다.
//		boolean, byte,	short,	int, long,	float, double, chart 등
		
//		-------------------------------------------------------------------------		
		
		
//		변수 선언
//		변수 초기화 (선언 후 처음으로 값 지정)
		 
		int a = 1; //선언 : 사용할 수 없다.
		int b = 1; //선언과 초기화
		
		int c = 0;
		
		c = a + b;
//		변수 초기화 하여야 메모리에 생성되고 연산에 이용될 수 있다.
//		그래서 변수선언시 초기화를 하는 습관을 들이자.
		
//		-----------------------------------------------------------------------------

//		정수형은 0
//		실수형은 0.0
//		문자형은 '' 또는 ""
		
		boolean defaultNy = false;
		
		byte aa = 0;
		short bb = 0;
		int cc = 0;
		long dd = 0;
		
		float ee = 0.0f;
		double ff = 0.0;
		
		char gg=' ';
		
		String hh = "";
		
//		-----------------------------------------------------------------------------
		
//		변수 사용 (변수값 저장 & 변수값 읽음)
		
//		리터럴 = 데이터
//		ex) 정수형 리터럴 = 정수형 데이터
		
//		이스케이프 문자 
		System.out.println(c);
		System.out.println("Yina Yun");
		System.out.println("Yina Yun : " + c + " warm!!");
		
		System.out.println("한칸들여쓰기");
		System.out.println("\t한칸들여쓰기");
		
		System.out.println("한줄바꿈1");
		System.out.println("\n한줄바꿈");
		
		System.out.println("한줄바꿈2");
		System.out.println("\r한줄바꿈");
		
		System.out.println("\'나는 생각한다.\'");
		System.out.println("소크라테스가 말했다.\"고로 나는 존재한다.\"");
		System.out.println("\\");
		
//		변수의 범위
//		변수는 선언된 블럭 내에서만 사용 가능하다.
		
		if(a ==1) {
			int aaa = 10;
			int bbb = aaa + a;
			System.out.println("bbb: " +bbb);
		} else {
			
		}
		
		
		
	}

}
