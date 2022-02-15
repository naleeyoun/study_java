package com.domain.lecture.ch04;

public class ContinueExample {

	public static void main(String[] args) {

//		for(int i=1; i<=10; i++) {
//			if(i%2 !=0) {
//				continue;
//			}
//			System.out.println(i);

		
		int a=1;
		
		while(a<=10) { //1(true), 2(true), 2(true)
			
			if(a%2 ==0) {//1(false), 2(true), 2(true)
				continue;
			}
			
			System.out.println(a); //1
			a++;
		}
			
			
		}
	}





