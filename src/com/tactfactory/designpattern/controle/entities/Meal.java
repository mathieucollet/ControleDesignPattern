package com.tactfactory.designpattern.controle.entities;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import com.tactfactory.designpattern.controle.entities.items.Complement;
import com.tactfactory.designpattern.controle.entities.items.Drink;
import com.tactfactory.designpattern.controle.menus.Menu;

public class Meal {
	private static Meal meal;
	private List<Item> items = new ArrayList<Item>();

	private Meal() {
	}

	public static Meal getMeal() {
		if (meal == null) {
			meal = new Meal();
		}
		return meal;
	}
	
	public static void newMeal() {
		meal = new Meal();
	}

	public Meal addItem(Item item) {
		items.add(item);
		return this;
	}

	public Meal addItem(Item item, Integer number) {
		for (int i = 0; i < number; i++) {
			items.add(item);
		}

		return this;
	}

	public float getCost() {
		float cost = 0.0f;

		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}

	public void showItems() {

		for (Item item : items) {
			System.out.print("Item : " + item.name());
			System.out.print(", Packing : " + item.packing().pack());
			System.out.println(", Price : " + item.price());
		}
	}
	
	public JTable getBill() {
		String[] entetes = {"", ""};
		Object[][] donnees = new Object[items.size() + 4][2]; 
		for (int i = 0; i < items.size(); i++) {
			donnees[i][0] = "";
			donnees[i][1] = items.get(i).price();
		}
		float TVAf = (float) ((getCost() / 100.0) * 20);
		float TTCf = getCost() + TVAf;
		String costHT = Float.toString((float) Math.round(getCost() * 100.0) / 100);
		String costTVA = Float.toString((float) Math.round(TVAf * 100.0) / 100);
		String costTTC = Float.toString((float) Math.round(TTCf * 100.0) / 100);
		donnees[items.size() + 1][0] = "Total HT   ";
		donnees[items.size() + 1][1] = costHT;
		donnees[items.size() + 2][0] = "TVA 20%   ";
		donnees[items.size() + 2][1] = costTVA;
		donnees[items.size() + 3][0] = "Total TTC   ";
		donnees[items.size() + 3][1] = costTTC;
		JTable tableau = new JTable(donnees, entetes);
		tableau.setShowGrid(false);
		DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
		rightRenderer.setHorizontalAlignment( JLabel.RIGHT );
		tableau.getColumnModel().getColumn(0).setCellRenderer( rightRenderer );
		return tableau;
	}

	@Override
	public String toString() {
		String txt = "";
		int i = 1;
		for (Item item : items) {
			txt += "N°" + i + " : " + (item instanceof Menu ? "Menu " : "") + item.name() + "\n";
			if (item instanceof Menu) {
				txt += ((Menu) item) + "\n";
			}
			if (item instanceof Drink || item instanceof Complement) {
				txt += "\tSize : " + item.size() + "\n";
			}
			txt += "\tPacking : " + item.packing() + "\n";
			txt += "\tPrice : " + item.price() + "\n";
			txt += "\n\n";
			i++;
		}
		return txt;
	}

}