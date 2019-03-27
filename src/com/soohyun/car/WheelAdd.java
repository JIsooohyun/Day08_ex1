package com.soohyun.car;

public class WheelAdd {

	public Car setWheel(Car car) {
		Wheel [] wheels = new Wheel[4];
		for(int i=0; i<wheels.length; i++) {
			Wheel w = new Wheel();
			w.color = "Red";
			w.size = 32;
			w.use = "Snow";
			wheels[i] =w ; 
			
		}
		car.wheels = wheels;
		
		return car;
	}
	
	
}
