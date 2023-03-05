package com.psja;

import java.util.List;
import java.util.ArrayList;

public class Channel {

	private String videoName;
	private String channelName;
	private List< Subscriber > subscriberList = new ArrayList<>();
	
	Channel( String channelName ){
		this.channelName = channelName;
	}
	
	public void addSubscriber( Subscriber subscriber ) {
		this.subscriberList.add( subscriber );
	}
	public void removeSubscriber( Subscriber rmvSubscriber ) {
		
		Integer i = 0;
		for ( Subscriber subscriber: subscriberList ) {
			i++;
			if ( subscriber.getSubscriberName().equalsIgnoreCase( 
													rmvSubscriber.getSubscriberName() ) ) {
				subscriberList.remove( i.intValue() );
				break;
			}
		}	
	}
	public void notifyInformation() {
		for ( Subscriber subscriber : subscriberList ) {
			subscriber.notifyInformation( this.videoName, this.channelName );
		}
	}
	public void uploadVideo( String name ) {
		this.videoName = name;
		notifyInformation();
	}
}
