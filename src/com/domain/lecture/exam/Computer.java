package com.domain.lecture.exam;

public class Computer extends Calculator{
	
	@Override
	public double areaCircle(int r) {
		return Constants.PAI_2 * r * r;
	}
}
