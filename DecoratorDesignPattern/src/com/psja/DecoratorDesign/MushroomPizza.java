package com.psja.DecoratorDesign;

public class MushroomPizza extends Toppings{
	
	BasePizza basePizza;
	
	public MushroomPizza( BasePizza basePizza ){
		this.basePizza = basePizza;
	}
	
	@Override
	public Integer price() {
		return 20 + this.basePizza.price();
	}

}
