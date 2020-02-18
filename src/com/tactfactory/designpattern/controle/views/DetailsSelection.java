package com.tactfactory.designpattern.controle.views;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.tactfactory.designpattern.controle.entities.Meal;

public class DetailsSelection extends JFrame {

	private Home home;

	private JButton validate = new JButton("Retour");
	private JButton newCommande = new JButton("Nouvelle commande");
	private JTextArea commandDetails = new JTextArea();
	

	public DetailsSelection() {
		this.setTitle("Details");
		this.setSize(1200, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		bindActions();
		addButtons();

		this.setVisible(true);
	}

	private void addButtons() {
		JPanel container = new JPanel();
		container.setLayout(new GridLayout(2, 2));
		
		JPanel containerDisplay = new JPanel();
		JScrollPane spDetails = new JScrollPane(commandDetails);
		JScrollPane spPrice = new JScrollPane(Meal.getMeal().getBill());
		containerDisplay.setLayout(new GridLayout(1, 1));
		containerDisplay.add(spDetails);
		containerDisplay.add(spPrice);
		container.add(containerDisplay);
		
		JPanel containerButtons = new JPanel();
		containerButtons.setLayout(new GridLayout(1, 1));
		containerButtons.add(validate);
		containerButtons.add(newCommande);
		container.add(containerButtons);	
		
		this.setContentPane(container);
	}

	private void bindActions() {

		validate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				home.setVisible(true);
				DetailsSelection.this.dispose();
			}
		});
		
		newCommande.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Meal.newMeal();
				home.setVisible(true);
				DetailsSelection.this.dispose();
			}
		});
	}

	public void setHome(Home home) {
		this.home = home;
		home.setVisible(false);
		Meal.getMeal().showItems();
		commandDetails.setText(Meal.getMeal().toString());
	}
}
