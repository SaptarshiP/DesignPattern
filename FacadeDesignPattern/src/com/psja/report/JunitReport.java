package com.psja.report;

public class JunitReport implements Report{

	@Override
	public void generateReport( String driverName ) {
		System.out.println( "I am in junit report "+ driverName );
	}
}
