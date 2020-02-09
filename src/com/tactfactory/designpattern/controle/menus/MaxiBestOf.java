package com.tactfactory.designpattern.controle.menus;

import com.tactfactory.designpattern.controle.utils.Constants;

public class MaxiBestOf extends Menu {
	
	public MaxiBestOf() {}
	
	public MaxiBestOf(String burger, String complement, String drink) {
		this.name = "Maxi Best Of";
		this.price = 9.5F;
		this.size = Constants.LARGE;
		
		setBurger(burger);
		setComplement(complement);
		setDrink(drink);
	}
}
