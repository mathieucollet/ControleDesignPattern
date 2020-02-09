package com.tactfactory.designpattern.controle.menus;

import com.tactfactory.designpattern.controle.utils.Constants;

public class BestOf extends Menu {
	
	
	public BestOf() {}
	
	public BestOf(String burger, String complement, String drink) {
		this.name = "Best Of";
		this.price = 8.9F;
		this.size = Constants.MEDIUM;
		
		setBurger(burger);
		setComplement(complement);
		setDrink(drink);
	}
	

}
