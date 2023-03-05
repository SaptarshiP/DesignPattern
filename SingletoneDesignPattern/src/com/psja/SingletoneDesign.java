package com.psja;

import static java.lang.System.out;

import com.psja.SingleToneDesignPattern.Single;
import com.psja.SingleToneDesignPattern.SingleToneClass;

public class SingletoneDesign {
	static Integer i = 5;
	public static void main( String args[] ) {
		out.println( "Hey" );
		
		Single single = new Single() {
							public void check() {
								SingleToneClass singleToneClass = SingleToneClass.getInstance();
								SingleToneClass singleToneClass1 = SingleToneClass.getInstance();
								singleToneClass.checkIt();
								out.println( singleToneClass );
								out.println( singleToneClass1 );
							}
						};
		single.check();
		
	}
	
}
