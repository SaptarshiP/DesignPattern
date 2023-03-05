package com.psja;

import static java.lang.System.out;
import static com.psja.factory.FactoryClient.createFactoryClient;

public class FactoryAbstractDesignPattern {

	public static void main( String args[] ) {
		out.println( "In the main class" );
		createFactoryClient();
	}
	
}
