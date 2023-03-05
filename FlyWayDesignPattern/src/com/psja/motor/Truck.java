package com.psja.motor;

import static java.lang.System.out;

public class Truck implements Vehicle {

	private String maximumSpeed;
	private String color;
	
	public Truck(){
		maximumSpeed = "150 km per hour";
	}
	
	@Override
	public void setColor( String color ) {
		this.color = color;
	}
	
	@Override
	public void generateOutput() {
		out.println( "The "+ color +" truck has maximum speed of " +maximumSpeed );
	}
}
