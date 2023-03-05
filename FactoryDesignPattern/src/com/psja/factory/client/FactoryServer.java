package com.psja.factory.client;

import static com.psja.factory.client.AndroidOS.getInstance;

public final class FactoryServer {

	public OS getInstanceOfOperatingSystem( String str ) {
		
		if ( str.equals( "ANDROID" ) )
			return getInstance();
		else if ( str.equals( "WINDOWS" ) )
			return new WindowsOS();
		else
			return IOS.getInstance();
	}
	
}
