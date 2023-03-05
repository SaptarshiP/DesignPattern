package com.psja.ProxyDesign;

public class WebPageProxy implements WebPage{
	
	WebPage webPage;
	
	public void renderPage( String url )throws CustomizedException{
		
		if ( url.equalsIgnoreCase( "www.youtube.com" ) ) {
			throw CustomizedException
								.builder()
								.Exp( new Exception( "The URL is forbidden" ) )
								.ErrorId( "123" )
								.ErrorName( "FORBIDDEN" )
								.build();
		}
		webPage = WebRender.getInstance();
		webPage.renderPage( url );
	}

}
