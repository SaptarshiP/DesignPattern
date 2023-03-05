package com.psja.templatedesign;

public class TemplateClass {

	public void templateMethod() {
		
		System.out.println( "In template Method" );
		this.loadLocalData();
		this.createObjects();
		this.downloadAdditionFiles();
		this.initializeProfiles();
	}
	
	public void loadLocalData() {
		System.out.println( "The default implementation of load local data" );
	}
	public void createObjects() {
		System.out.println( "The default implementation of create object" );
	}
	public void downloadAdditionFiles() {
		System.out.println( "The default implementation of download additional files" );
	}
	public void initializeProfiles() {
		System.out.println( "The daullt implementation of initialize profiles" );
	}
	
}
