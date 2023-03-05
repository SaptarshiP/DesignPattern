package com.psja.Prototype;

import static java.lang.System.out;

import com.psja.Prototype.design.PrototypeCheck;

public class PrototypeDesignPattern {

	public static void main( String args[] ) {
		out.println( "Here" );
		
		class client{
			
			public void checkProtoypeClient(){
				PrototypeCheck.checkClone();
			}
		}
		new client().checkProtoypeClient();
	}
	
}
