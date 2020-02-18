package com.tactfactory.designpattern.controle.factories;

import com.tactfactory.designpattern.controle.menus.BestOf;
import com.tactfactory.designpattern.controle.menus.GoldenMenu;
import com.tactfactory.designpattern.controle.menus.HappyMeal;
import com.tactfactory.designpattern.controle.menus.MaxiBestOf;
import com.tactfactory.designpattern.controle.menus.Menu;
import com.tactfactory.designpattern.controle.utils.Constants;

public class MenuFactory {
	public Menu create(String menu, String burger1, String burger2, String complement, String drink, String toy) {
		Menu me = null;

		switch (menu) {
		case Constants.MBO:
			me = new MaxiBestOf(burger1, complement, drink);
			break;
		case Constants.BO:
			me = new BestOf(burger1, complement, drink);
			break;
		case Constants.HM:
			me = new HappyMeal(burger1, complement, drink, toy);
			break;
		case Constants.GM:
			me = new GoldenMenu(burger1, burger2, complement, drink);
			break;
		default:
			break;
		}
		
		return me;
	}
}