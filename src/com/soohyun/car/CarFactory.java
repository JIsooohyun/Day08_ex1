package com.soohyun.car;

public class CarFactory {
	
	public void makeCar() {
		EngineAdd en = new EngineAdd();
		WheelAdd wa = new WheelAdd();
		Carview cv = new Carview();
		ColorPaint cp = new ColorPaint();
		
		Car car = new Car();  //Car()는 메서드야 ㅠㅠ
		
		
		car = en.setEngine(car);
		car = wa.setWheel(car);
		cp.setColor(car);
		//cv.view(car);
		car.info("blue");
		Car car2 = new Car();
		car2.color = "white";
		car2.info("red");
	}

}
