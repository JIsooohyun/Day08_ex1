package com.soohyun.car;

public class Car {
	Engine engine;
	Wheel [] wheels;
	String color;
	
	
	public void info(String color) {
		//멤버메서드내에서 멤버변수를 사용할 때
		System.out.println(color);
		System.out.println(this.color);  //자기참조변수 -> 지역변수  color랑 멤버변수를 구별하기 위해서 사용
		this.info2();  //참조변수 this는 생략가능 
	}
	
	
	public void info2() {
		System.out.println("Cqr!!!!!!!!!!!!!!!!");
	}
}
