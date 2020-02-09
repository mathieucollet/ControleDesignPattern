package com.tactfactory.designpattern.controle.factories;

import com.tactfactory.designpattern.controle.menus.BestOf;
import com.tactfactory.designpattern.controle.menus.GoldenMenu;
import com.tactfactory.designpattern.controle.menus.HappyMeal;
import com.tactfactory.designpattern.controle.menus.MaxiBestOf;
import com.tactfactory.designpattern.controle.menus.Menu;
import com.tactfactory.designpattern.controle.utils.Constants;

public class MenuFactory {
	public Menu create(String menu, String burger, String complement, String drink) {
		Menu me = null;
		
		switch (menu) {
		case Constants.MBO:
			me = new MaxiBestOf(burger, complement, drink);
			break;
		case Constants.BO:
			me = new BestOf(burger, complement, drink);
			break;
		default:
			break;
		}
		
		return me;
	}
	
	public Menu create(String menu, String one, String two, String three, String four) {
		Menu me = null;
		
		switch (menu) {
		case Constants.HM:
			me = new HappyMeal(one, two, three, four);
			break;
		case Constants.GM:
			me = new GoldenMenu(one, two, three, four);
			break;
		default:
			break;
		}
		
		return me;
	}
}