package com.tactfactory.designpattern.controle.entities.items;

import com.tactfactory.designpattern.controle.utils.Constants;

public class CocacolaDrink extends Drink {	
	public CocacolaDrink(String size) {
		this.name = Constants.COCACOLA;
		this.size = size;
		switch (size) {
		case Constants.SMALL:
			this.price = 2.2F;
			break;
		case Constants.MEDIUM:
			this.price = 2.7F;
			break;
		case Constants.LARGE:
			this.price = 2.95F;
			break;
		default:
			this.price = 0;
			break;
		}
	}
}
