package com.soohyun.car;

public class EngineAdd {
	
	public Car setEngine(Car car) {
		Engine engine = new Engine();
		engine.hp = 100;
		engine.cc = 1000;
		engine.fuel = "gas";
		
		car.engine = engine; 
		
		return car;
	}
	

}
