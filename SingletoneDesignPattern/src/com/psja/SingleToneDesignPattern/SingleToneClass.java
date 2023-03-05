package com.psja.SingleToneDesignPattern;

public class SingleToneClass {

	private static SingleToneClass instance;
	
	private SingleToneClass() {}

	public static SingleToneClass getInstance() {
		
		if ( instance == null )
			instance = new SingleToneClass();
		return instance;
	}
	
	public void checkIt() {
		System.out.println( "I am in singletone class" );
	}
}
