package com.psja.FactoryDesign;

import java.util.Arrays;
import java.util.List;

import com.psja.BuilderDesignPattern.CustomSystemException;
import com.psja.DecoratorDesign.BasePizza;
import com.psja.DecoratorDesign.CheesePizza;
import com.psja.DecoratorDesign.ChickenPizza;
import com.psja.DecoratorDesign.MargaretaPizza;
import com.psja.DecoratorDesign.MushroomPizza;

public class FactoryServer {

	public BasePizza createPizzaAccordingToRequirement( String requirement )throws CustomSystemException {
		
		List<String> requirementArr = Arrays.asList(requirement.split( "_" ));
		BasePizza  basePizza = null;
		if ( requirementArr.contains( "CHEESE" ) && requirementArr.contains( "MARGARETA" ) )
			basePizza = new MargaretaPizza( new CheesePizza() );
		else if ( requirementArr.contains( "CHICKEN" ) && requirementArr.contains( "MUSHROOM" ) )
			basePizza = new MushroomPizza( new ChickenPizza() );
		else
			throw CustomSystemException.builder()
										.ErrorId( "ERR101" )
										.ErrorName( "The error has come" )
										.Exp( new Exception( "Sorry the pizza item can't be delivered" ) )
										.build();
		return basePizza;
	}
	
}
