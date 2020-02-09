package com.tactfactory.designpattern.controle.menus;

import com.tactfactory.designpattern.controle.entities.items.BigmacBurger;
import com.tactfactory.designpattern.controle.entities.items.Burger;
import com.tactfactory.designpattern.controle.entities.items.CboBurger;
import com.tactfactory.designpattern.controle.utils.Constants;

public class GoldenMenu extends Menu {
	protected Burger burger2;
	
	public GoldenMenu() {}
	
	public GoldenMenu(String burger, String burger2, String complement, String drink) {
		this.name = "Best Of";
		this.price = 8.9F;
		this.size = Constants.MEDIUM;
		
		setBurger(burger);
		setComplement(complement);
		setDrink(drink);
		
		switch (burger2) {
		case Constants.BIGMAC:
			this.burger2 = new BigmacBurger();
			break;
		case Constants.CBO:
			this.burger2 = new CboBurger();
		default:
			this.burger2 = null;
			break;
		}
	}

	@Override
	public String toString() {
		return "Name=" + name + ", packing=" + packing + ", burger=" + burger + ", burger2=" + burger + ", complement=" + complement
				+ ", drink=" + drink + ", price=" + price;
	}
	
	
	

}
