package com.psja;

import static java.lang.System.out;

import com.psja.FactoryDesign.FactoryServer;
import com.psja.FactoryDesign.FactoryClient;

public class DecoratorDesignPattern {

	public static void main( String args[] ) {
		out.println( "In the decorator design pattern" );
		
		FactoryClient factoryClient = new FactoryClient( new FactoryServer() );
		factoryClient.createRequirment();
	}
	
}
