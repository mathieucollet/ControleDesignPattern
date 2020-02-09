package com.tactfactory.designpattern.controle.entities.packings;

import com.tactfactory.designpattern.controle.entities.Packing;

public class Bag implements Packing {

	@Override
	public String pack() {
		return "Bag";
	}

}
