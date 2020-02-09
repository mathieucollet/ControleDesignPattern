package com.tactfactory.designpattern.controle.entities.packings;

import com.tactfactory.designpattern.controle.entities.Packing;

public class Bottle implements Packing {

	@Override
	public String pack() {
		return "Bottle";
	}

}
