package com.soohyun.mobile;

public class Phone {

	String brand;
	int price;
	String color;
	int size;
	
	public Phone() {
		//매개변수가 없는 것을 디폴트 생성자, 빈생성자, 기본생성자 라고 불린다. 
		//클래스내에 생성자가 하나라도 없으면 컴파일러가 디폴트생성자를 하나 만들어준다
		
		this.brand = "LG";
		this.price = 200;
		color = "Red"; //this는 생략 가능
		size = 15;
		System.out.println("phone 제작이 완료되었습니다.");
		//메서드내에서 메서드를 호출가능하다.
		this.info();
	}
	
	public void info() {
		System.out.println("phone ~~~~~~~~~~~");
		//멤버메서드 
	}

}
