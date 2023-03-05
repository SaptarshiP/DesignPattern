package com.psja.BuilderStyle;

public class SmartPhoneBuilder {

	private String os;
	private String camera;
	private String processor;
	private String batteryCapacity;
	private String screenSize;
	
	public SmartPhoneBuilder(){}
	
	SmartPhoneBuilder( String os, String camera, String processor, String batteryCapacity, String screenSize ){
		
		super();
		this.os = os;
		this.camera = camera;
		this.processor = processor;
		this.batteryCapacity = batteryCapacity;
		this.screenSize = screenSize;
		
	}
	
	public static SmartPhoneBuilder builder() {
		return new SmartPhoneBuilder();
	}
	
	public SmartPhoneBuilder Os( String os ) {
		this.os = os;
		return this;
	}
	public SmartPhoneBuilder Camera( String camera ) {
		this.camera = camera;
		return this;
	}
	public SmartPhoneBuilder Processor( String processor ) {
		this.processor = processor;
		return this;
	}
	public SmartPhoneBuilder BatteryCapacity( String batteryCapacity ) {
		this.batteryCapacity = batteryCapacity;
		return this;
	}
	public SmartPhoneBuilder ScreenSize( String screenSize ) {
		this.screenSize = screenSize;
		return this;
	}
	
	@Override
	public String toString() {
		return "os:" + this.os + 
					", camera:" + this.camera + 
					",processor:" + this.processor +
					",batteryCapacity:"+this.batteryCapacity+
					",screen size:"+this.screenSize;
	}
	
	public SmartPhoneBuilder build() {
		return new SmartPhoneBuilder( this.os, 
										this.camera,
										this.processor,
										this.batteryCapacity, 
										this.screenSize );
	}
}
