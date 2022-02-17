package com.domain.lecture.function;

import java.util.Scanner;

public class Function {

	public static void main(String[] args) {

//	2. 함수의 사용
		int sum = add(4, 2);
		System.out.println(sum);
		
		int subtract = bbb(4, 2);
		System.out.println(subtract);
		
		int multiply = ccc(4, 2);
		System.out.println(multiply);
		
		int remainder = ddd(4, 2);
		System.out.println(remainder);
		
		int division = eee(4, 2);
		System.out.println(division);
		
		int result[] = all(4,2);
		
		for ( int i=0 ; i<result.length; i++) {
		System.out.println(result[i]);
		}
		
		for(int a : allInOne(6, 3)) {
			System.out.println(a);
		}
		
		System.out.println(bbbb("윤이나", "윤삼나"));
		
	}
	
//	1. 함수 선언
	public static int add(int a, int b) {
		int sum = a + (b+1);
		return sum;
	}
	

//	 - * % / 에 대한 함수를 선언 후 사용하는 프로그래밍을 완성하시오.
	
	public static int bbb(int a, int b) {
		int subtract = a - b;
		return subtract;
	}
	public static int ccc(int a, int b) {
		int multiply = a * b;
		return multiply;
	}
	public static int ddd(int a, int b) {
		int remainder = a % b;
		return remainder;
	}
	public static int eee(int a, int b) {
		int division = a / b;
		return division;
	}
	
	public static int[] all(int a, int b) {
		int plus = a+b;
		int minus = a-b;
		int multiply = a*b;
		int divide = a/b;
		int result[] = {plus, minus, multiply, divide};
		
		System.out.println("a + b =" + plus);
		System.out.println("a - b =" + minus);
		System.out.println("a * b =" + multiply);
		System.out.println("a / b =" + divide);
		
		return result;
	}

	public static int[] allInOne(int a, int b) {
		int sum = 0;
		int[] sum2 = new int[5];
			sum2[0] = a + b;
			sum2[1] = a-b;
			sum2[2] = a*b;
			sum2[3] = a/b;
			sum2[4] = a%b;
		
		return sum2;
	}
	
	
	
	
	
	
	public int aaa (int a, int b, int c, String d, boolean e) {
		System.out.println(e);
		return 1;
	}

	public String bbb () {
		
		return "";
	}
	
	public boolean ccc () {
		
		return true;
	}
	
	
//	덧셈함수
//	input : int, int
//	output : int
	
	public static int addd(int a, int b) {
		return 1;
	}
	
	
//	두 문자열을 합치는 함수
	
	public static String bbbb(String a, String b){
		String ccc = a + b;
		
		return ccc;
	}
	
//	오늘 뭐 먹지 프로그램
//	배열 사용
//	함수 사용
//	출력을 위한 함수도 별도로 제작
//	
//	중식, 한식, 일식, 양식
//	오늘 추천 드리는 메뉴는 ?? 입니다.
	
	
	public String aaa(String a) {

	System.out.println("오늘 뭐 먹지?");
	System.out.println("중식, 한식, 일식, 양식 중에서 골라주세요!");
	System.out.println("종료하려면 q를 눌러주세요.");

	Scanner scanner = new Scanner(System.in);
	String inputString;
	
	do {
		System.out.print(">");
		inputString = scanner.nextLine();
		System.out.println(inputString);
	} while( ! inputString.equals("q"));
	
	System.out.println();
	System.out.println("프로그램 종료");
	
}
	
	
	
	if 
	
	int chineseFood = (int)(Math.random() * (4-1 +1) + 1);

	switch (chineseFood) {
	case 1:
		System.out.println("오늘 추천 드리는 메뉴는 짜장면 입니다.");
		break;
	case 2:
		System.out.println("오늘 추천 드리는 메뉴는 짬뽕 입니다.");
		break;
	case 3:
		System.out.println("오늘 추천 드리는 메뉴는 울면 입니다.");
		break;
	case 4:
		System.out.println("오늘 추천 드리는 메뉴는 딤섬 입니다.");
		break;
	}
	
	int koreaFood = (int)(Math.random() * (4-1 +1) + 1);
	
	switch (koreaFood) {
	case 1:
		System.out.println("오늘 추천 드리는 메뉴는 김치찌개 입니다.");
		break;
	case 2:
		System.out.println("오늘 추천 드리는 메뉴는 된장찌개 입니다.");
		break;
	case 3:
		System.out.println("오늘 추천 드리는 메뉴는 비빔밥 입니다.");
		break;
	case 4:
		System.out.println("오늘 추천 드리는 메뉴는 육개장 입니다.");
		break;
	}
	
	int japanFood = (int)(Math.random() * (4-1 +1) + 1);
	
	switch (japanFood) {
	case 1:
		System.out.println("돈까스");
		break;
	case 2:
		System.out.println("초밥");
		break;
	case 3:
		System.out.println("회덮밥");
		break;
	case 4:
		System.out.println("연어덮밥");
		break;
	}
	
	int westernFood = (int)(Math.random() * (4-1 +1) + 1);
	
	switch (westernFood) {
	case 1:
		System.out.println("파스타");
		break;
	case 2:
		System.out.println("스테이크");
		break;
	case 3:
		System.out.println("샐러드");
		break;
	case 4:
		System.out.println("수프");
		break;
	}
	
	
}
