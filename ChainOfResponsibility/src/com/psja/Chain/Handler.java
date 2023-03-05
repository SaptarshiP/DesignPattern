package com.psja.Chain;

public abstract class Handler {

	private Handler nextHandler;
	
	public Handler setNextHandler( Handler nextHandler ) {
		this.nextHandler = nextHandler;
		return this.nextHandler;
	}
	
	public abstract Boolean handle( String userName, String password );
	
	public Boolean moveToNextHandler( String userName, String password ) {
		if ( this.nextHandler == null )
			return Boolean.FALSE;
		return this.nextHandler.handle( userName, password );
	}
}
