package com.psja;

import static java.lang.System.out;

import com.psja.ProxyDesign.WebPage;
import com.psja.ProxyDesign.WebPageProxy;

public class ProxyDesignPattern {

	public static void main( String args[] ) {
		out.println( "Here" );
		
		WebPage webPage = new WebPageProxy();
		try {
			webPage.renderPage("www.stackoverflow.com");
		} catch( Exception exp ) {
			out.println( exp.getMessage() );
		}
	}
	
}
