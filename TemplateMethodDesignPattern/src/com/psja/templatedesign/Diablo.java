package com.psja.templatedesign;

public class Diablo extends TemplateClass{

	@Override
	public void createObjects() {
		System.out.println( "The Diablo implementation of create object" );
	}
	@Override
	public void downloadAdditionFiles() {
		System.out.println( "The Diablo implementation of download additional files" );
	}
}
