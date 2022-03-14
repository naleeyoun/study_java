package com.domain.lecture.ch13;

public class BoxExample {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();	// String t
		box.set("윤이나");
		String str = box.get();
		System.out.println("str: " + str);
		
		Box<Integer> box2 = new Box<Integer>();		// Integer t
		box2.set(11);
		int number = box2.get();
		System.out.println("number: " + number);
		
		Box<Integer> box3 = new Box<>();
		box3.set(10);
		System.out.println(box3);
	}

}
