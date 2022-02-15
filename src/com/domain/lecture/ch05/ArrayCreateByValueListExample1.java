package com.domain.lecture.ch05;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {

//		int[] score;	//선언
//		
//		int score2[];	//선언
//		
//		int[] score3 = {1,2,3,4,5,6,7,8,9,10};	//객체생성 
//		
//		int score4[] = {4,5,6};	//객체생성
//		
//		double[] score6 = {1,2,3,4};
//		
//		String[] strArray = {"윤이나", "윤삼나", "윤사나", "윤오나"};		
		
//		입력이 되는 데이터 타입이 동일해야한다.
//		순서는 무조건 0부터 시작한다. index
//		총갯수를 원활하게 늘릴 수 없다
		
		int[] score = {83,90,87,99};
		
//		System.out.println("score[0]: " + score[0]);
//		System.out.println("score[1]: " + score[1]);
//		System.out.println("score[2]: " + score[2]);
//		System.out.println("score[3]" + score[3]); // 0부터 시작하므로 0,1,2까지밖에 안됨
		
		int sum=0;
		double avg=0;
		for(int i=0; i<4; i++) {
			
			sum +=score[i];
			
		}
			avg =(double)sum/4;
		System.out.println("총합은: " + sum);
		System.out.println("평균은: " + avg);
	}

}
