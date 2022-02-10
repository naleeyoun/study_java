package com.domain.lecture.ch04;

public class ifNestedExample {

	public static void main(String[] args) {

//		int score = 98;
//		String grade = "";
//		
//		if(score >= 90) {
//			if(score >=95) {
//				grade = "A+";
//			} else {
//				grade = "A";
//			}
//		}
//		System.out.println("학점은: " +grade);
		
//		
		double score = 2.3;
		String grade = "";

		
		if(score >= 0) {
			  if (score >= 2.0) {
				grade="D";
			  } else {
				grade="F";
			  }  
		}			
		
		if(score >= 2.5) {
			  if (score >= 3.0) {
				grade="B";
			  } else {
				grade="C";
			  }  
		}	
		
		
		if(score >= 3.5) {
			if (score >= 4.0) {
			 grade="A+";
		    } else {
			grade="A";
		    }  
		}
			
		System.out.println("학점은: " +grade);

		

	          


		
		
	
	}
}

