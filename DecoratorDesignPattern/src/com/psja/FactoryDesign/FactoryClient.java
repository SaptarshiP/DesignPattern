package com.psja.FactoryDesign;

import static java.lang.System.out;

import com.psja.DecoratorDesign.BasePizza;

public class FactoryClient {

	private FactoryServer factoryServer;
	
	public FactoryClient( FactoryServer factoryServer ){
		this.factoryServer = factoryServer;
	}
	
	public void createRequirment() {
		
		BasePizza basePizza = null;
		
		try {
			basePizza = factoryServer.createPizzaAccordingToRequirement("MUSHROOM_CHICKEN");
			System.out.println( basePizza.price() );
		} catch( Exception exp ) {
			out.println( exp.getMessage() );
		}
		
	}
	
}
