package com.psja.factory.client;

import static java.lang.System.out;

public final class IOS implements OS {

	private static IOS instance;
	
	private IOS(){}
	
	public static IOS getInstance() {
		if ( instance == null )
			instance = new IOS();
		return instance;
	}
	
	@Override
	public void specification() {
		out.println( "The IOS" );
	}
}
