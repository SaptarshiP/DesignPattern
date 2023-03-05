package com.psja.facade;

import com.jarcheck.driver.ChromeDriver;
import com.jarcheck.driver.Driver;
import com.jarcheck.driver.ExplorerDriver;
import com.jarcheck.driver.OperaDriver;
import com.psja.model.BROWSER_NAME;
import com.psja.model.REPORT_Enum;
import com.psja.report.Report;
import com.psja.report.HTMLReport;
import com.psja.report.JunitReport;

public class FacadeDesign {

	private Report report;
		
	public void facadeWork( BROWSER_NAME browserName, REPORT_Enum reportEnum ) {
		
		
		Driver driver = null;
		switch( browserName ) {
			case CHROME:
				{
					driver = new ChromeDriver();
					System.out.println( driver.getDriver() );
					generateReport( reportEnum, browserName );
					break;
				}
			case OPERA:
				{
					driver = new OperaDriver();
					System.out.println( driver.getDriver() );
					generateReport( reportEnum, browserName );
					break;
				}
			case EXPLORER:
				{
					driver = new ExplorerDriver();
					System.out.println( driver.getDriver() );
					generateReport( reportEnum, browserName );
					break;
				}
		}
		
	}
	
	public void generateReport( REPORT_Enum reportEnum, BROWSER_NAME browserName ) {
		
		switch ( reportEnum ) {
			case HTML:
				{
					report = new HTMLReport();
					report.generateReport( browserName.name() );
					break;
				}
			case JUNIT:
				{
					report = new JunitReport();
					report.generateReport( browserName.name() );
					break;
				}
		}
	}
	
}
