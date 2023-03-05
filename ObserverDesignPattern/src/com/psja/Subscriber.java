package com.psja;

import java.util.List;
import java.util.ArrayList;

public class Subscriber {

	private String subscriberName;
	private List< Channel > channelList = new ArrayList<>();
	
	Subscriber( String subscriberName ){
		super();
		this.subscriberName = subscriberName;
	}
	
	public String getSubscriberName() {
		return this.subscriberName;
	}
	public void notifyInformation( String videoName, String channelName ) {
		System.out.println( "The video uploaded for :"+this.subscriberName+" video name " + videoName +" channel name is:"+ channelName );
	}
	public void setChannelList( Channel channel ) {
		this.channelList.add( channel );
	}
}
