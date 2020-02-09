package com.tactfactory.designpattern.controle.entities.items;

import com.tactfactory.designpattern.controle.entities.Item;
import com.tactfactory.designpattern.controle.entities.Packing;
import com.tactfactory.designpattern.controle.entities.packings.Box;

public abstract class Burger implements Item {
	protected String name;
    protected Packing packing = new Box();
    protected float price;

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
		return "Burger => " + name + ", packing=" + packing.pack() + ", price=" + price + '}';
	}

}
