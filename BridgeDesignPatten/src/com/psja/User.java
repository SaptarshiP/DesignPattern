package com.psja;

public class User {

	public static void userTask() {
		WorkshopPurpose workshopPurpose1 = new Producer();
		WorkshopPurpose workshopPurpose2 = new Manufacturer();
		
		Vehicle car = new Car( workshopPurpose1, workshopPurpose2 );
		Vehicle bus = new Bus( workshopPurpose1, workshopPurpose2 );
		
		car.create();
		bus.create();
	}
	
}
