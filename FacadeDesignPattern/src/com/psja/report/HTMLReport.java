package com.psja.report;

public class HTMLReport implements Report {

	public void generateReport( String driverName ) {
		System.out.println( "I am in html report for driver " + driverName );
	}
	
}
