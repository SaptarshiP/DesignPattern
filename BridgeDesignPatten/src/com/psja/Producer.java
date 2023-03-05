package com.psja;

public class Producer implements WorkshopPurpose{

	@Override
	public void work( String purpose ) {
		System.out.println( "Producing the :" + purpose );
	}

}
