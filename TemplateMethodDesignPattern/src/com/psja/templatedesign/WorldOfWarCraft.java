package com.psja.templatedesign;

public class WorldOfWarCraft extends TemplateClass {

	@Override
	public void loadLocalData() {
		System.out.println( "The WorldOfWarCraft implementation of load local data" );
	}
	@Override
	public void initializeProfiles() {
		System.out.println( "The WorldOfWarCraft implementation of initialize profiles" );
	}
}
