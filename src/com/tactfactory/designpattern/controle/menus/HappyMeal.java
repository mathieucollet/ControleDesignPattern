package com.tactfactory.designpattern.controle.menus;

import com.tactfactory.designpattern.controle.entities.items.BoyToy;
import com.tactfactory.designpattern.controle.entities.items.GirlToy;
import com.tactfactory.designpattern.controle.entities.items.Toy;
import com.tactfactory.designpattern.controle.utils.Constants;

public class HappyMeal extends Menu {
	protected Toy toy;
	
	public HappyMeal() {}
	
	public HappyMeal(String burger, String complement, String drink, String toy) {
		this.name = "Best Of";
		this.price = 8.9F;
		this.size = Constants.MEDIUM;
		
		setBurger(burger);
		setComplement(complement);
		setDrink(drink);
		
		switch (toy) {
		case Constants.BOYTOY:
			this.toy = new BoyToy();
			break;
		case Constants.GIRLTOY:
			this.toy = new GirlToy();
		default:
			this.toy = null;
			break;
		}
	}

	@Override
	public String toString() {
		return "Name=" + name + ", packing=" + packing + ", burger=" + burger + ", complement=" + complement
				+ ", drink=" + drink + ", toy=" + toy + ", price=" + price;
	}
	
	
	

}
