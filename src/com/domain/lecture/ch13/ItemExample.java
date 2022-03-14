package com.domain.lecture.ch13;

public class ItemExample {

	public static void main(String[] args) {

		Product<Car, Integer> product = new Product<>();
		product.setKind(new Car());
		product.setModel(450);
		
		Car rtCar = product.getKind();
		Integer rtInteger = product.getModel();
		
		System.out.println(rtCar + " : " + rtInteger);
		
		
		
	}

}
