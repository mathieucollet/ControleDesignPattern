package com.tactfactory.designpattern.controle.entities.items;

public class CocacolaDrink extends Drink {	
	public CocacolaDrink(String size) {
		this.name = "Coca-Cola";
		switch (size) {
		case "small":
			this.price = 2.2F;
			break;
		case "medium":
			this.price = 2.7F;
		case "large":
			this.price = 2.95F;
			break;
		default:
			this.price = 0;
			break;
		}
	}
}
