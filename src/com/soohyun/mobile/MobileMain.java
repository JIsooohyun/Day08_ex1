package com.soohyun.mobile;

public class MobileMain {

	public static void main(String[] args) {
	
		PhoneView pv= new PhoneView();
		
		Phone phone = new Phone();   //생성자를 호출하는 것이다.
		pv.view(phone);
		
	}

}
