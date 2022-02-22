package com.domain.lecture.ch06;

public class KoreanExample {

	public static void main(String[] args) {

		Korean korean = new Korean();
		
		System.out.println("korean.nation: " + korean.nation);
		System.out.println("korean.name: " + korean.name);
		System.out.println("korean.ssn: " + korean.ssn);
		
		korean.name = "윤이나";
		korean.ssn = "0312453577522";
		
		System.out.println("---------------------------");
		System.out.println("korean.nation: " + korean.nation);
		System.out.println("korean.name: " + korean.name);
		System.out.println("korean.ssn: " + korean.ssn);
		
		Korean korean2 = new Korean("윤삼나", "2145357895452");
				
		System.out.println("---------------------------");
		System.out.println("korean.nation: " + korean2.nation);
		System.out.println("korean.name: " + korean2.name);
		System.out.println("korean.ssn: " + korean2.ssn);
		
		Korean korean3 = new Korean("윤사나", "2021453585345");
		
		System.out.println("---------------------------");
		System.out.println("korean.nation: " + korean3.nation);
		System.out.println("korean.name: " + korean3.name);
		System.out.println("korean.ssn: " + korean3.ssn);
		
	}

}
