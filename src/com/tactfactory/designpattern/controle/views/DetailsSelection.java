package com.tactfactory.designpattern.controle.views;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.tactfactory.designpattern.controle.entities.Meal;

public class DetailsSelection extends JFrame {

  private Home home;
  private Meal meal;

  private JButton validate = new JButton("Retour");
  private JTextField commandDetails = new JTextField();
  private JTextField price = new JTextField();

  public DetailsSelection() {
    this.setTitle("Details");
    this.setSize(400, 200);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    bindActions();
    addButtons();

    this.setVisible(true);
  }

  private void addButtons() {
    JPanel container = new JPanel();
    container.setLayout(new GridLayout(3, 1));
    container.add(commandDetails);
    container.add(price);
    container.add(validate);
    this.setContentPane(container);
  }

  private void bindActions() {

    // Actions code here
//    JButton.addActionListener(new ActionListener() {
//
//      @Override
//      public void actionPerformed(ActionEvent e) {
//        // Do something
//      }
//    });

    validate.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        home.setMeal(meal);
        home.setVisible(true);
        DetailsSelection.this.dispose();
      }
    });
  }

  public void setHome(Home home) {
    this.home = home;
    meal = home.getMeal();
    home.setVisible(false);
    meal.showItems();
    commandDetails.setText(meal.toString());

    float TVAf = (meal.getCost() / 100) * 20;
    float TTCf = meal.getCost() + TVAf;
    String costHT = Float.toString(meal.getCost());
    String costTTC  = Float.toString(TTCf);
    
    price.setText("Price HT: " + costHT +" / " + "Price TTC: " + costTTC);
  }
}
