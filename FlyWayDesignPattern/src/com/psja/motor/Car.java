package com.psja.motor;

public class Car implements Vehicle {

	private String maximumSpeed;
	private String color;
	public Car(){
		this.maximumSpeed = "200 km per hr";
	}
	
	@Override
	public void setColor( String color ) {
		this.color = color;
	}
	
	@Override
	public void generateOutput() {
		System.out.println( "The "+ color +" car has maximum speed of "+ maximumSpeed );
	}
}
