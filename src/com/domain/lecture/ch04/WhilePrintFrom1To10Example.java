package com.domain.lecture.ch04;

public class WhilePrintFrom1To10Example {

	public static void main(String[] args) {

//		int i = 1;
//		
//		while(i <= 10) {
//			System.out.println(i);
//			i++;
//			
//		}
//		
		//1~10 합 55
		
		int j = 1;
		int sum = 0;
		
		
		while(j <= 10) {
			sum += j;
			j++;
		}
		System.out.println("1부터 10까지의 합은 :"+ sum);
		
		
	}

}
