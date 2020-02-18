package com.tactfactory.designpattern.controle.entities.items;

import com.tactfactory.designpattern.controle.utils.Constants;

public class PotatoesComplement extends Complement{	
	public PotatoesComplement(String size) {
		this.name = Constants.POTATOES;
		this.size = size;
		switch (size) {
		case Constants.SMALL:
			this.price = 1.95F;
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
