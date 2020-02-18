package com.tactfactory.designpattern.controle.menus;

import com.tactfactory.designpattern.controle.utils.Constants;

public class GoldenMenu extends Menu {
	public GoldenMenu() {}
	
	public GoldenMenu(String burger, String burger2, String complement, String drink) {
		this.name = Constants.GM;
		this.price = 11F;
		this.size = Constants.LARGE;
		
		setBurger(burger);
		setBurger2(burger2);
		setComplement(complement);
		setDrink(drink);
		System.out.println(this.burger2);
	}
}
