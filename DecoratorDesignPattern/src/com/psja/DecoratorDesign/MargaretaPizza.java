package com.psja.DecoratorDesign;

public class MargaretaPizza extends Toppings{

	BasePizza basePizza;
	public MargaretaPizza( BasePizza basePizza ){
		this.basePizza = basePizza;
	}
	
	@Override
	public Integer price() {
		return 10 + this.basePizza.price();
	}
	
}
