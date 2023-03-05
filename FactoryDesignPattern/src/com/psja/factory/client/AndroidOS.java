package com.psja.factory.client;

import static java.lang.System.out;

public final class AndroidOS implements OS {

	private static OS instance;
	
	private AndroidOS(){}
	
	public static OS getInstance() {
		if ( instance == null )
			instance = new AndroidOS();
		return instance;
	}
	
	@Override
	public void specification() {
		out.println( "The Android OS" );
	}
	
}
