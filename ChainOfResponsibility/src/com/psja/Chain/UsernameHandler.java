package com.psja.Chain;

public class UsernameHandler extends Handler {

	private Database database; 
	
	public UsernameHandler( Database database ) {
		this.database = database;
	}
	
	@Override
	public Boolean handle( String userName, String password ) {
		System.out.println( "Username handler" );
		if ( database.checkUserName( userName ) )
			this.moveToNextHandler( userName, password );
		return Boolean.FALSE;
			
	}
}
