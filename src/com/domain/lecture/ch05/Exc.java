package com.domain.lecture.ch05;

public class Exc {

	public static void main(String[] args) {

// aaa.length : 배열길이		
		
//		2부터 9까지 정수형 배열 변수 2개를 만들고
//		for 문을 사용하여 구구단 출력을 하시오.
		
		int[] aaa = {2,3,4,5,6,7,8,9};
		int[] bbb = {2,3,4,5,6,7,8,9};
		
		int result=0;
				
		for(int i=0; i<aaa.length; i++) {
			System.out.println("★ " + aaa[i] + "단 ★");
			System.out.println("===========");
			for(int j=0; j<bbb.length; j++) {
				result = aaa[i]*bbb[j];
				System.out.println(aaa[i] + " X " + bbb[j] + " = " + result);
			}
			System.out.println("===========");
		}
		
	}

}
