package com.psja.CompositeDesign;

public class Leaf implements Component {

	private Integer price;
	private String device;
	
	Leaf( Integer price, String device ){
		this.price = price;
		this.device = device;
	}
	
	@Override
	public void showPrice() {
		System.out.println( device + ":" +price );
	}
}
