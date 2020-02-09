package com.tactfactory.designpattern.controle.entities.items;

public class FriesComplement extends Complement{	
	public FriesComplement(String size) {
		this.name = "Fries";
		switch (size) {
		case "small":
			this.price = 1.95F;
			break;
		case "medium":
			this.price = 2.7F;
			break;
		case "large":
			this.price = 2.95F;
			break;
		default:
			this.price = 0;
			break;
		}
	}
}
