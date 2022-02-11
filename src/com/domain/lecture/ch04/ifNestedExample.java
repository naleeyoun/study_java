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
//		int score = 76;
//		String grade = "";
//		
//		if(score >= 95) {
//			grade = "A+"; 
//		} else {
//			if(score >= 90) {
//				grade = "A";
//			} else {
//				if(score >= 85) {
//					grade = "B+";
//				} else {
//					if(score >= 80) {
//						grade = "B";
//					} else {
//						if(score >= 75) {
//							grade = "C+";
//						} else {
//							if(score >= 70) {
//								grade = "C";
//							} else {
//								if(score >= 65) {
//									grade = "D+";
//								} else {
//									if(score >= 60) {
//										grade = "D";
//									} else {
//										grade = "F";
//									}
//								}	
//							}
//						}
//					}
//				}
//			}
//		}
//		System.out.println("학점은: " +grade);
//		
//		int score = 76;
//		String grade = "";
//
//		if (score >= 90) {
//		   if (score >= 95) {
//		      grade = "A+";
//		   } else {
//		      grade = "A";
//		   }
//		}
//		else if  (score >= 80) {
//			if (score >= 85) {
//		         grade = "B+";
//		    } else {
//		         grade = "B";
//		    }
//		}
//		else if (score >= 70) {
//			if (score >= 75) {
//	            grade = "C+";
//	         } else {
//	            grade = "C";
//	         }
//		}
//		else if (score >= 60) {
//			if (score >= 65) {
//		        grade = "D+";
//		      } else {
//		        grade = "D";
//		      }
//		} else {
//				grade = "F";
//			  }
//	
//		System.out.println("학점은:" + grade);

		
		int a = 2;
		int b = -2;
		String quadrant = "";
		
		if ( a > 0 ) {
			if (b > 0) {
				quadrant = "제1사분면";
			} else {
				quadrant = "제4사분면";
			}
		}
		else if (a < 0) {
			if (b > 0) {
				quadrant = "제2사분면";
			} else {
				quadrant = "제3사분면";
			}
		} else {
				quadrant = "x축, y축, 영점";
		}
		
		System.out.println("(a,b)는: " + quadrant + "에 있습니다." );
	}
}

