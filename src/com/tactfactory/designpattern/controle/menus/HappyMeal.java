package com.tactfactory.designpattern.controle.menus;

import com.tactfactory.designpattern.controle.entities.items.Toy;
import com.tactfactory.designpattern.controle.utils.Constants;

public class HappyMeal extends Menu {
	protected Toy toy;
	
	public HappyMeal() {}
	
	public HappyMeal(String burger, String complement, String drink, String toy) {
		this.name = Constants.HM;
		this.price = 6F;
		this.size = Constants.SMALL;
		
		setBurger(burger);
		setComplement(complement);
		setDrink(drink);
		setToy(toy);
		
	}
}
