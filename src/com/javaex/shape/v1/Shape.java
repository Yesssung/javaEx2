package com.javaex.shape.v1;

public abstract class Shape {

	// 추상 클래스
	// 자신이 객체화 될 수 없다.
	// 상속을 위한 부모 클래스로만 존재
	// 안쪽에 추상 메소드를 가져야 한다.
	// 상속받은 클래스는 부모클래스에서 선언된 추상 메서드를 반드시 구현해야 한다.

	protected int x;
	protected int y;
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	// 추상 메소드
	// -> 추상 클래스를 상속받은 클래스에서 반드시 구현해야 한다.
	public abstract void draw(); // 메소드 구현은 없고 선언만 있다.
	public abstract double area();
	

}
