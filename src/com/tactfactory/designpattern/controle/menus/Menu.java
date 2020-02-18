package com.tactfactory.designpattern.controle.menus;

import com.tactfactory.designpattern.controle.entities.Item;
import com.tactfactory.designpattern.controle.entities.Packing;
import com.tactfactory.designpattern.controle.entities.items.BigmacBurger;
import com.tactfactory.designpattern.controle.entities.items.BoyToy;
import com.tactfactory.designpattern.controle.entities.items.Burger;
import com.tactfactory.designpattern.controle.entities.items.CboBurger;
import com.tactfactory.designpattern.controle.entities.items.CocacolaDrink;
import com.tactfactory.designpattern.controle.entities.items.Complement;
import com.tactfactory.designpattern.controle.entities.items.Drink;
import com.tactfactory.designpattern.controle.entities.items.FriesComplement;
import com.tactfactory.designpattern.controle.entities.items.GirlToy;
import com.tactfactory.designpattern.controle.entities.items.IceteaDrink;
import com.tactfactory.designpattern.controle.entities.items.PotatoesComplement;
import com.tactfactory.designpattern.controle.entities.items.Toy;
import com.tactfactory.designpattern.controle.entities.packings.Box;
import com.tactfactory.designpattern.controle.utils.Constants;

public class Menu implements Item {
	protected String name;
	protected Packing packing = new Box();
	protected Burger burger;
	protected Burger burger2;
	protected Complement complement;
	protected Drink drink;
	protected Toy toy;
	protected float price;
	protected String size;

	public void setBurger(String burger) {
		switch (burger) {
		case Constants.BIGMAC:
			this.burger = new BigmacBurger();
			break;
		case Constants.CBO:
			this.burger = new CboBurger();
			break;
		default:
			this.burger = null;
			break;
		}
	}
	
	public void setBurger2(String burger2) {
		switch (burger2) {
		case Constants.BIGMAC:
			this.burger2 = new BigmacBurger();
			break;
		case Constants.CBO:
			this.burger2 = new CboBurger();
			break;
		default:
			this.burger2 = null;
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
			break;
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
			break;
		default:
			this.drink = null;
			break;
		}
	}
	
	public void setToy(String toy) {
		switch (toy) {
		case Constants.BOYTOY:
			this.toy = new BoyToy();
			break;
		case Constants.GIRLTOY:
			this.toy = new GirlToy();
			break;
		default:
			this.toy = null;
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
		String secondBurger = burger2 != null ? "\n\t2nd Burger : " + burger2.name() : "";
		String tToy = toy != null ? "\n\tToy : " + toy.name() : "";
		return "\tBurger : " + burger.name() + secondBurger + "\n\tComplement : " + size + " " + complement.name() + "\n\tDrink : " + size + " " + drink.name() + tToy;
	}

	@Override
	public String size() {
		// TODO Auto-generated method stub
		return null;
	}	
}