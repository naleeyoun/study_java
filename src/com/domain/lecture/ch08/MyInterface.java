package com.domain.lecture.ch08;

public interface MyInterface {
	void method1();	// public abstract 추상메소드 /  implements하는 다른파일들은 무조건 method1()을 추가해야한다
//	void method2();
	
	default void method2() {	//default의 경우 다른파일들에 추가 안해도 된다.
		System.out.println("MyInterface-method2() 실행");
	}
}