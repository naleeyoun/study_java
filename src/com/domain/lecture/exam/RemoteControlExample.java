package com.domain.lecture.exam;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl remotecontrol = new Television();
		
//		 변수 100을 사용하였을 때 결과
		remotecontrol.turnOn();
		remotecontrol.setMute(true);
		remotecontrol.setMute(false);
		remotecontrol.setVolume(100);
		RemoteControl.changeBattery();
		remotecontrol.turnOff();
		
		System.out.println();

//		 변수 -10을 사용하였을 때 결과
		remotecontrol.turnOn();
		remotecontrol.setMute(true);
		remotecontrol.setMute(false);
		remotecontrol.setVolume(-10);
		RemoteControl.changeBattery();
		remotecontrol.turnOff();
		
	}
}
