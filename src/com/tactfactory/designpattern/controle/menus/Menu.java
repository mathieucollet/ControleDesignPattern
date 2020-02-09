package com.tactfactory.designpattern.controle.menus;

import com.tactfactory.designpattern.controle.entities.Item;
import com.tactfactory.designpattern.controle.entities.Packing;
import com.tactfactory.designpattern.controle.entities.items.BigmacBurger;
import com.tactfactory.designpattern.controle.entities.items.Burger;
import com.tactfactory.designpattern.controle.entities.items.CboBurger;
import com.tactfactory.designpattern.controle.entities.items.CocacolaDrink;
import com.tactfactory.designpattern.controle.entities.items.Complement;
import com.tactfactory.designpattern.controle.entities.items.Drink;
import com.tactfactory.designpattern.controle.entities.items.FriesComplement;
import com.tactfactory.designpattern.controle.entities.items.IceteaDrink;
import com.tactfactory.designpattern.controle.entities.items.PotatoesComplement;
import com.tactfactory.designpattern.controle.entities.packings.Box;
import com.tactfactory.designpattern.controle.utils.Constants;

public class Menu implements Item {
	protected String name;
	protected Packing packing = new Box();
	protected Burger burger;
	protected Complement complement;
	protected Drink drink;
	protected float price;
	protected String size;

	public void setBurger(String burger) {
		switch (burger) {
		case Constants.BIGMAC:
			this.burger = new BigmacBurger();
			break;
		case Constants.CBO:
			this.burger = new CboBurger();
		default:
			this.burger = null;
			break;
		}
	}

	public void setComplement(String complement) {
		switch (complement) {
		case Constants.FRIES:
			this.complement = new FriesComplement(size);
			break;
		case Constants.POTATOES:
			this.complement = new PotatoesComplement(size);
		default:
			this.complement = null;
			break;
		}
	}

	public void setDrink(String drink) {
		switch (drink) {
		case Constants.COCACOLA:
			this.drink = new CocacolaDrink(size);
			break;
		case Constants.ICETEA:
			this.drink = new IceteaDrink(size);
		default:
			this.drink = null;
			break;
		}
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return this.packing;
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public String toString() {
		return "Name=" + name + ", packing=" + packing + ", burger=" + burger + ", complement=" + complement
				+ ", drink=" + drink + ", price=" + price;
	}
	
	
}