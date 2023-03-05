package com.psja;

import static java.lang.System.out;

public class ObserverDesign {

	public static void main( String args[] ) {
		out.println( "In observer design pattern" );
		
		Channel channel = new Channel( "Psja_Channel" );
		
		Subscriber s1 = new Subscriber( "P" );
		Subscriber s2 = new Subscriber( "S" );
		Subscriber s3 = new Subscriber( "J" );
		Subscriber s4 = new Subscriber( "A" );
		
		s1.setChannelList( channel );
		
		channel.addSubscriber( s1 );
		channel.addSubscriber( s2 );
		channel.addSubscriber( s3 );
		channel.addSubscriber( s4 );
		
		channel.removeSubscriber( s3 );
		
		channel.uploadVideo( "Learn programming" );
	}
	
}
