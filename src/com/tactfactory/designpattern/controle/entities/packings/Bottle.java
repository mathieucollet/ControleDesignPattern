package com.tactfactory.designpattern.controle.entities.packings;

import com.tactfactory.designpattern.controle.entities.Packing;

public class Bottle implements Packing {

	@Override
	public String pack() {
		return "Bottle";
	}

	@Override
	public String toString() {
		return "Bottle";
	}
}
