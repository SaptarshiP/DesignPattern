package com.psja.Chain;

public class PasswordHandler extends Handler{

	private Database database;
	
	public PasswordHandler( Database database ) {
		this.database = database;
	}
	@Override
	public Boolean handle( String userName, String password ) {
		System.out.println( "Password handler" );
		if ( database.checkPassword( password ) )
			this.moveToNextHandler(userName, password);
		return Boolean.FALSE;
	}
}
