package com.domain.lecture.ch08;

public class RemoteControlExample2 {

	// 익명 구현 객체
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
				
				@Override
				public void turnOn() {
					System.out.println("adadaf");
					
				}
				
				@Override
				public void turnOff() {
					
				}
				
				@Override
				public void setVolume(int Volume) {
					
				}
		};
		rc.turnOn();
	}

}
