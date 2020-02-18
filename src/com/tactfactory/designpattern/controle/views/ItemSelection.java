package com.tactfactory.designpattern.controle.views;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.tactfactory.designpattern.controle.entities.MealBuilder;
import com.tactfactory.designpattern.controle.entities.items.BigmacBurger;
import com.tactfactory.designpattern.controle.entities.items.CboBurger;
import com.tactfactory.designpattern.controle.entities.items.CocacolaDrink;
import com.tactfactory.designpattern.controle.entities.items.FriesComplement;
import com.tactfactory.designpattern.controle.entities.items.IceteaDrink;
import com.tactfactory.designpattern.controle.entities.items.PotatoesComplement;
import com.tactfactory.designpattern.controle.utils.Constants;

public class ItemSelection extends JFrame {

  private Home home;

  private JButton burger1 = new JButton(Constants.BIGMAC);
  private JButton burger2 = new JButton(Constants.CBO);

  private JButton drink1Small = new JButton(Constants.SMALL + " " + Constants.COCACOLA);
  private JButton drink1Medium = new JButton(Constants.MEDIUM + " " + Constants.COCACOLA);
  private JButton drink1Big = new JButton(Constants.LARGE + " " + Constants.COCACOLA);

  private JButton drink2Small = new JButton(Constants.SMALL + " " + Constants.ICETEA);
  private JButton drink2Medium = new JButton(Constants.MEDIUM + " " + Constants.ICETEA);
  private JButton drink2Big = new JButton(Constants.LARGE + " " + Constants.ICETEA);

  private JButton friesSmall = new JButton(Constants.SMALL + " " + Constants.FRIES);
  private JButton friesMedium = new JButton(Constants.MEDIUM + " " + Constants.FRIES);
  private JButton friesBig = new JButton(Constants.LARGE + " " + Constants.FRIES);

  private JButton potatoesSmall = new JButton(Constants.SMALL + " " + Constants.POTATOES);
  private JButton potatoesMedium = new JButton(Constants.MEDIUM + " " + Constants.POTATOES);
  private JButton potatoesBig = new JButton(Constants.LARGE + " " + Constants.POTATOES);

  private JButton validate = new JButton("Valider");
  
  final MealBuilder mealBuilder = new MealBuilder();

  public ItemSelection() {
    this.setTitle("Items");
    this.setSize(1200, 800);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    bindActions();
    addButtons();

    this.setVisible(true);
  }

  private void addButtons() {
    JPanel container = new JPanel();
    container.setLayout(new GridLayout(2, 1));

    JPanel containerBurger = new JPanel();
    containerBurger.setLayout(new GridLayout(2, 4));
    containerBurger.add(burger1);
    containerBurger.add(burger2);
    container.add(containerBurger);

    JPanel containerDrink = new JPanel();
    containerDrink.setLayout(new GridLayout(2, 3));
    containerDrink.add(drink1Small);
    containerDrink.add(drink1Medium);
    containerDrink.add(drink1Big);
    containerDrink.add(drink2Small);
    containerDrink.add(drink2Medium);
    containerDrink.add(drink2Big);
    container.add(containerDrink);

    JPanel containerAccompaniment = new JPanel();
    containerAccompaniment.setLayout(new GridLayout(2, 3));
    containerAccompaniment.add(friesSmall);
    containerAccompaniment.add(friesMedium);
    containerAccompaniment.add(friesBig);
    containerAccompaniment.add(potatoesSmall);
    containerAccompaniment.add(potatoesMedium);
    containerAccompaniment.add(potatoesBig);
    container.add(containerAccompaniment);

    container.add(validate);
    this.setContentPane(container);
  }

  private void bindActions() {

    // Actions code here
	burger1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
    	  mealBuilder.addItem(new BigmacBurger());
      }
    });
	burger2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
    	  mealBuilder.addItem(new CboBurger());
      }
    });
	drink1Small.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
    	  mealBuilder.addItem(new CocacolaDrink(Constants.SMALL));
      }
    });
	drink1Medium.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
    	  mealBuilder.addItem(new CocacolaDrink(Constants.MEDIUM));
      }
    });
	drink1Big.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
    	  mealBuilder.addItem(new CocacolaDrink(Constants.LARGE));
      }
    });
	drink2Small.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
    	  mealBuilder.addItem(new IceteaDrink(Constants.SMALL));
      }
    });
	drink2Medium.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
    	  mealBuilder.addItem(new IceteaDrink(Constants.MEDIUM));
      }
    });
	drink2Big.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
    	  mealBuilder.addItem(new IceteaDrink(Constants.LARGE));
      }
    });
	friesSmall.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
    	  mealBuilder.addItem(new FriesComplement(Constants.SMALL));
      }
    });
	friesMedium.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
    	  mealBuilder.addItem(new FriesComplement(Constants.MEDIUM));
      }
    });
	friesBig.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
    	  mealBuilder.addItem(new FriesComplement(Constants.LARGE));
      }
    });
	potatoesSmall.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
    	  mealBuilder.addItem(new PotatoesComplement(Constants.SMALL));
      }
    });
	potatoesMedium.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
    	  mealBuilder.addItem(new PotatoesComplement(Constants.MEDIUM));
      }
    });
	potatoesBig.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
    	  mealBuilder.addItem(new PotatoesComplement(Constants.LARGE));
      }
    });

    validate.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        home.setVisible(true);
        ItemSelection.this.dispose();
      }
    });
  }

  public void setHome(Home home) {
    this.home = home;
    home.setVisible(false);
  }
}
