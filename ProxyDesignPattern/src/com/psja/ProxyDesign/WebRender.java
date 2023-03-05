package com.psja.ProxyDesign;

public class WebRender implements WebPage{

	private static WebRender instance;
	private WebRender() {}
	
	public static WebRender getInstance() {
		if ( instance == null )
			instance = new WebRender();
		return instance;
	}
	
	public void renderPage( String url )throws CustomizedException{
		System.out.println( "The " + url + "is rendered" );
	}
}
