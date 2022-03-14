package com.domain.lecture.ch13;

public class Product<T, M> {	// 멀티타입 파라미터 제네릭 Generic
	
	private T kind;
	private M model;
	
	
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	
	
	
}
