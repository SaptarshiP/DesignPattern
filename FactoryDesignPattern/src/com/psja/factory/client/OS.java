package com.psja.factory.client;

public interface OS {

	final Integer num = 8;
	
	public void specification();
	
	public default void output() {
		System.out.println( num );
	}
}
