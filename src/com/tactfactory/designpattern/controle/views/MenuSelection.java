package com.tactfactory.designpattern.controle.views;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.tactfactory.designpattern.controle.entities.Meal;
import com.tactfactory.designpattern.controle.entities.MealBuilder;
import com.tactfactory.designpattern.controle.factories.MenuFactory;
import com.tactfactory.designpattern.controle.menus.Menu;
import com.tactfactory.designpattern.controle.utils.Constants;

public class MenuSelection extends JFrame {

  private Home home;
  private Meal meal;

  private JButton bestOf = new JButton("BestOf");
  private JButton maxiBestOf = new JButton("MaxiBestOf");

  private JButton burger1 = new JButton("Burger1");
  private JButton burger2 = new JButton("Burger2");

  private JButton drink1 = new JButton("Drink1");
  private JButton drink2 = new JButton("Drink2");

  private JButton fries = new JButton("Fries");
  private JButton potatoes = new JButton("Potatoes");

  private JButton validate = new JButton("Valider");
  
  private String menuName;
  private String burger1Name;
  private String burger2Name;
  private String complementName;
  private String drinkName;
  private String toyName;
  
  public MenuSelection() {
    this.setTitle("Menu");
    this.setSize(400, 200);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    bindActions();
    addButtons();

    this.setVisible(true);
  }

  private void addButtons() {
    JPanel container = new JPanel();
    container.setLayout(new GridLayout(3, 1));

    JPanel containerType = new JPanel();
    containerType.setLayout(new GridLayout(1, 2));
    containerType.add(bestOf);
    containerType.add(maxiBestOf);
    container.add(containerType);

    JPanel containerBurger = new JPanel();
    containerBurger.setLayout(new GridLayout(2, 4));
    containerBurger.add(burger1);
    containerBurger.add(burger2);
    container.add(containerBurger);

    JPanel containerDrink = new JPanel();
    containerDrink.setLayout(new GridLayout(2, 4));
    containerDrink.add(drink1);
    containerDrink.add(drink2);
    container.add(containerDrink);

    JPanel containerAccompaniment = new JPanel();
    containerAccompaniment.setLayout(new GridLayout(2, 4));
    containerAccompaniment.add(fries);
    containerAccompaniment.add(potatoes);
    container.add(containerAccompaniment);

    container.add(validate);
    this.setContentPane(container);
  }

  private void bindActions() {
	  
    // Actions code here
	bestOf.addActionListener(new ActionListener() {
	@Override
      public void actionPerformed(ActionEvent e) {
    	  menuName = Constants.BO;
      }
    });
	maxiBestOf.addActionListener(new ActionListener() {
	@Override
      public void actionPerformed(ActionEvent e) {
    	  menuName = Constants.MBO;
      }
    });
	burger1.addActionListener(new ActionListener() {
	@Override
      public void actionPerformed(ActionEvent e) {
		burger1Name = Constants.BIGMAC;
      }
    });
	burger2.addActionListener(new ActionListener() {
	@Override
      public void actionPerformed(ActionEvent e) {
		burger1Name = Constants.CBO;
      }
    });
	drink1.addActionListener(new ActionListener() {
	@Override
      public void actionPerformed(ActionEvent e) {
    	  drinkName = Constants.COCACOLA;
      }
    });
	drink2.addActionListener(new ActionListener() {
	@Override
      public void actionPerformed(ActionEvent e) {
		drinkName = Constants.ICETEA;
      }
    });
	fries.addActionListener(new ActionListener() {
	@Override
      public void actionPerformed(ActionEvent e) {
    	  complementName = Constants.FRIES;
      }
    });
	potatoes.addActionListener(new ActionListener() {
	@Override
      public void actionPerformed(ActionEvent e) {
		complementName = Constants.POTATOES;
      }
    });
	
	

    validate.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
		  MenuFactory mf = new MenuFactory();
	      MealBuilder builder = new MealBuilder();
	      
	      Menu menu = mf.create(menuName, burger1Name, complementName, drinkName);
	      builder.addItem(menu);
	      meal.showItems();
			home.setMeal(meal);
			home.setVisible(true);
			MenuSelection.this.dispose();
      }
    });
  }

  public void setHome(Home home) {
    this.home = home;
    meal = home.getMeal();
    home.setVisible(false);
  }
}
