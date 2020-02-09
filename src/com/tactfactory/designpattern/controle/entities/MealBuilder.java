package com.tactfactory.designpattern.controle.entities;

import com.tactfactory.designpattern.controle.menus.Menu;

public class MealBuilder {
	private Meal meal = new Meal();
	
	public Meal addItem(Item item) {
		this.meal.addItem(item);
		
		return meal;
	}
}
