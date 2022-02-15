package com.domain.lecture.ch04;

public class Test2 {

	public static void main(String[] args) {

		
//		int sum = 0;
//		
//		for(int i =1; i<=10; i++) {
//			sum = sum + i; 	// sum += i;
//		}
//		
//		System.out.println(sum);
		
		
		
		
		int num1 = (int)(Math.random() * (45-1 +1) + 1);
		int num2 = (int)(Math.random() * (45-1 +1) + 1);
		int num3 = (int)(Math.random() * (45-1 +1) + 1);
		int num4 = (int)(Math.random() * (45-1 +1) + 1);
		int num5 = (int)(Math.random() * (45-1 +1) + 1);
		int num6 = (int)(Math.random() * (45-1 +1) + 1);
		
		if(num1==num2|num1==num3|num1==num4|num1==num5|num1==num6) {
			System.out.println("중복된 숫자가 있습니다.");}
			else {
				System.out.println(num1+","+num2+","+num3+","+num4+","+num5+","+num6);
			}

		}
		
		

	}


