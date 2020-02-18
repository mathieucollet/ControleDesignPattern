package com.tactfactory.designpattern.controle.views;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.tactfactory.designpattern.controle.entities.MealBuilder;
import com.tactfactory.designpattern.controle.factories.MenuFactory;
import com.tactfactory.designpattern.controle.utils.Constants;

public class MenuSelection extends JFrame {

	private Home home;

	private JButton bestOf = new JButton(Constants.BO);
	private JButton maxiBestOf = new JButton(Constants.MBO);
	private JButton happyMeal = new JButton(Constants.HM);
	private JButton goldenMenu = new JButton(Constants.GM);

	private JButton burger1 = new JButton(Constants.BIGMAC);
	private JButton burger2 = new JButton(Constants.CBO);
	private JButton burger3 = new JButton(Constants.BIGMAC);
	private JButton burger4 = new JButton(Constants.CBO);

	private JButton drink1 = new JButton(Constants.COCACOLA);
	private JButton drink2 = new JButton(Constants.ICETEA);

	private JButton fries = new JButton(Constants.FRIES);
	private JButton potatoes = new JButton(Constants.POTATOES);

	private JButton boyToy = new JButton(Constants.BOYTOY);
	private JButton girlToy = new JButton(Constants.GIRLTOY);

	private JButton validate = new JButton("Valider");
	private JButton reset = new JButton("Reset");
	private JButton back = new JButton("Annuler");

	private String menuName;
	private String burger1Name;
	private String burger2Name;
	private String complementName;
	private String drinkName;
	private String toyName;

	public MenuSelection() {
		this.setTitle("Menu");
		this.setSize(1200, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		validate.setBackground(Color.decode("#32CD32"));
		reset.setBackground(Color.decode("#FFA500"));
		back.setBackground(Color.decode("#FF0000"));

		bindActions();
		addButtons();
		disableAllButtons();
		validate.setEnabled(false);

		this.setVisible(true);
	}

	private void addButtons() {
		JPanel container = new JPanel();
		container.setLayout(new GridLayout(3, 2));

		JPanel containerType = new JPanel();
		containerType.setLayout(new GridLayout(2, 1));
		containerType.add(bestOf);
		containerType.add(maxiBestOf);
		containerType.add(happyMeal);
		containerType.add(goldenMenu);
		container.add(containerType);

		JPanel containerBurger = new JPanel();
		containerBurger.setLayout(new GridLayout(2, 2));
		containerBurger.add(burger1);
		containerBurger.add(burger3);
		containerBurger.add(burger2);
		containerBurger.add(burger4);
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

		JPanel containerToy = new JPanel();
		containerToy.setLayout(new GridLayout(2, 4));
		containerToy.add(boyToy);
		containerToy.add(girlToy);
		container.add(containerToy);

		JPanel containerValidation = new JPanel();
		containerValidation.setLayout(new GridLayout(1, 3));
		containerValidation.add(back);
		containerValidation.add(reset);
		containerValidation.add(validate);
		container.add(containerValidation);

		this.setContentPane(container);
	}

	private void bindActions() {

		// Actions code here
		bestOf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				resetMenusColor();
				resetBurgers2Color();
				resetToysColor();
				burger2Name = null;
				toyName = null;
				bestOf.setBackground(Color.decode("#B0E0E6"));
				menuName = Constants.BO;
				disableAllButtons();
				enableButtons();
				checkIfValidable();
			}
		});
		maxiBestOf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				resetMenusColor();
				resetBurgers2Color();
				resetToysColor();
				burger2Name = null;
				toyName = null;
				maxiBestOf.setBackground(Color.decode("#B0E0E6"));
				menuName = Constants.MBO;
				disableAllButtons();
				enableButtons();
				checkIfValidable();
			}
		});
		happyMeal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				resetMenusColor();
				resetBurgers2Color();
				burger2Name = null;
				happyMeal.setBackground(Color.decode("#B0E0E6"));
				menuName = Constants.HM;
				disableAllButtons();
				enableButtons();
				checkIfValidable();
			}
		});
		goldenMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				resetMenusColor();
				resetToysColor();
				toyName = null;
				goldenMenu.setBackground(Color.decode("#B0E0E6"));
				menuName = Constants.GM;
				disableAllButtons();
				enableButtons();
				checkIfValidable();
			}
		});
		burger1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				resetBurgersColor();
				burger1.setBackground(Color.decode("#B0E0E6"));
				burger1Name = Constants.BIGMAC;
				checkIfValidable();
			}
		});
		burger2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				resetBurgersColor();
				burger2.setBackground(Color.decode("#B0E0E6"));
				burger1Name = Constants.CBO;
				checkIfValidable();
			}
		});
		burger3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				resetBurgers2Color();
				burger3.setBackground(Color.decode("#B0E0E6"));
				burger2Name = Constants.BIGMAC;
				checkIfValidable();
			}
		});
		burger4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				resetBurgers2Color();
				burger4.setBackground(Color.decode("#B0E0E6"));
				burger2Name = Constants.CBO;
				checkIfValidable();
			}
		});
		drink1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				resetDrinksColor();
				drink1.setBackground(Color.decode("#B0E0E6"));
				drinkName = Constants.COCACOLA;
				checkIfValidable();
			}
		});
		drink2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				resetDrinksColor();
				drink2.setBackground(Color.decode("#B0E0E6"));
				drinkName = Constants.ICETEA;
				checkIfValidable();
			}
		});
		fries.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				resetComplementsColor();
				fries.setBackground(Color.decode("#B0E0E6"));
				complementName = Constants.FRIES;
				checkIfValidable();
			}
		});
		potatoes.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				resetComplementsColor();
				potatoes.setBackground(Color.decode("#B0E0E6"));
				complementName = Constants.POTATOES;
				checkIfValidable();
			}
		});
		boyToy.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				resetToysColor();
				boyToy.setBackground(Color.decode("#B0E0E6"));
				toyName = Constants.BOYTOY;
				checkIfValidable();
			}
		});
		girlToy.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				resetToysColor();
				girlToy.setBackground(Color.decode("#B0E0E6"));
				toyName = Constants.GIRLTOY;
				checkIfValidable();
			}
		});

		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				disableAllButtons();
				resetBurgersColor();
				resetBurgers2Color();
				resetComplementsColor();
				resetDrinksColor();
				resetToysColor();
				resetMenusColor();
				menuName = null;
				burger1Name = null;
				burger2Name = null;
				complementName = null;
				drinkName = null;
				toyName = null;
				checkIfValidable();
			}
		});

		back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				home.setVisible(true);
				MenuSelection.this.dispose();
			}
		});

		validate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MenuFactory mf = new MenuFactory();
				MealBuilder builder = new MealBuilder();

				builder.addItem(mf.create(menuName, burger1Name, burger2Name, complementName, drinkName, toyName));

				home.setVisible(true);
				MenuSelection.this.dispose();
			}
		});
	}

	public void setHome(Home home) {
		this.home = home;
		home.setVisible(false);
	}

	public void resetMenusColor() {
		bestOf.setBackground(new JButton().getBackground());
		maxiBestOf.setBackground(new JButton().getBackground());
		happyMeal.setBackground(new JButton().getBackground());
		goldenMenu.setBackground(new JButton().getBackground());
	}

	public void resetBurgersColor() {
		burger1.setBackground(new JButton().getBackground());
		burger2.setBackground(new JButton().getBackground());
	}

	public void resetBurgers2Color() {
		burger3.setBackground(new JButton().getBackground());
		burger4.setBackground(new JButton().getBackground());
	}

	public void resetDrinksColor() {
		drink1.setBackground(new JButton().getBackground());
		drink2.setBackground(new JButton().getBackground());
	}

	public void resetComplementsColor() {
		fries.setBackground(new JButton().getBackground());
		potatoes.setBackground(new JButton().getBackground());
	}

	public void resetToysColor() {
		boyToy.setBackground(new JButton().getBackground());
		girlToy.setBackground(new JButton().getBackground());
	}

	public void disableAllButtons() {
		burger1.setEnabled(false);
		burger2.setEnabled(false);
		burger3.setEnabled(false);
		burger4.setEnabled(false);
		drink1.setEnabled(false);
		drink2.setEnabled(false);
		fries.setEnabled(false);
		potatoes.setEnabled(false);
		boyToy.setEnabled(false);
		girlToy.setEnabled(false);
	}

	public void enableButtons() {
		burger1.setEnabled(true);
		burger2.setEnabled(true);
		drink1.setEnabled(true);
		drink2.setEnabled(true);
		fries.setEnabled(true);
		potatoes.setEnabled(true);
		if (menuName == Constants.HM) {
			boyToy.setEnabled(true);
			girlToy.setEnabled(true);
		}
		if (menuName == Constants.GM) {
			burger3.setEnabled(true);
			burger4.setEnabled(true);
		}
	}

	public void checkIfValidable() {
		if (menuName != null) {
			switch (menuName) {
			case Constants.BO:
			case Constants.MBO:
				if (burger1Name != null && drinkName != null && complementName != null) {
					validate.setEnabled(true);
				} else {
					validate.setEnabled(false);
				}
				break;
			case Constants.GM:
				if (burger1Name != null && burger2Name != null && drinkName != null && complementName != null) {
					validate.setEnabled(true);
				} else {
					validate.setEnabled(false);
				}
				break;
			case Constants.HM:
				if (burger1Name != null && drinkName != null && complementName != null && toyName != null) {
					validate.setEnabled(true);
				} else {
					validate.setEnabled(false);
				}
				break;
			default:
				validate.setEnabled(false);
				break;
			}
		} else {
			validate.setEnabled(false);
		}
	}
}
