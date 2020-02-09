package com.tactfactory.designpattern.controle.entities;

public class MealBuilder {
	private Meal meal = new Meal();
	
	public Meal addItem(Item item) {
		this.meal.addItem(item);
		
		return meal;
	}
}
