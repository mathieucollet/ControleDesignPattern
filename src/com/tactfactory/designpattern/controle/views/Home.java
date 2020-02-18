package com.tactfactory.designpattern.controle.views;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Home extends JFrame {

  private JButton menus = new JButton("Menus");
  private JButton addItem = new JButton("Element seul");
  private JButton validate = new JButton("Valider");

  public Home() {

    this.setTitle("Home");
    this.setSize(1200, 800);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    bindActions();
    addButtons();

    this.setVisible(true);
  }

  private void addButtons() {
    JPanel container = new JPanel();
    container.setLayout(new GridLayout(3, 1));
    container.add(menus);
    container.add(addItem);
    container.add(validate);
    this.setContentPane(container);
  }

  private void bindActions() {
    menus.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        MenuSelection menuSelection = new MenuSelection();
        menuSelection.setHome(Home.this);
      }
    });

    addItem.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        ItemSelection itemSelection = new ItemSelection();
        itemSelection.setHome(Home.this);
      }
    });

    validate.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        DetailsSelection detailsSelection = new DetailsSelection();
        detailsSelection.setHome(Home.this);
      }
    });
  }
}
