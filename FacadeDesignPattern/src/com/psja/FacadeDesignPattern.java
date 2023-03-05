package com.psja;

import static java.lang.System.out;

import com.psja.facade.FacadeClient;

public class FacadeDesignPattern {

	public static void main( String args[] ) {
		out.println( "In the Facade design Pattern" );
		FacadeClient.clientOperation();
	}
}
