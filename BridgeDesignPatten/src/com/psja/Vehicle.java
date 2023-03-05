package com.psja;

public abstract class Vehicle {
	
	WorkshopPurpose workshopPurpose1;
	WorkshopPurpose workshopPurpose2;
	
	protected Vehicle( WorkshopPurpose workshopPurpose1, WorkshopPurpose workshopPurpose2 ) {
		this.workshopPurpose1 = workshopPurpose1;
		this.workshopPurpose2 = workshopPurpose2;
	}
	
	public abstract void create();

}
