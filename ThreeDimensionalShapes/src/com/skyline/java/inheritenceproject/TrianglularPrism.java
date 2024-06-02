package com.skyline.java.inheritenceproject;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TrianglularPrism extends ThreeDimensionalShape { 
		
	int myTrigleBase;
	int myTrigleSide1;
	int myTrigleSide2;
	int myTriangleHeight;
	int myHeight;
	//this overrides the method getDimensionsFromUser in ThreeDimensionalShape
	@Override
	public void getDimensionsFromUser() {
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Please enter the base of the base triangle: ");
		myTrigleBase = inputReader.nextInt();
		System.out.println("Please enter the side1 of the base triangle: ");
		myTrigleSide1 = inputReader.nextInt();
		System.out.println("Please enter the side2 of the base triangle: ");
		myTrigleSide2 = inputReader.nextInt();
		// Height can be calculated but for the sake of simplicity, take it as the input
		System.out.println("Please enter the height of the base triangle: ");
		myTriangleHeight = inputReader.nextInt();
		System.out.println("Please enter the height of the Prism: ");
		myHeight = inputReader.nextInt();
		calculateAreaAndVolume();
	}
	 //this overrides method calculateAreaAndVolume from ThreeDimensionalShape
	@Override
	public void calculateAreaAndVolume() {
		//The surface area of the triangular prism = 2( Area of the base) + ( Perimeter of the base x height of the prism)
		double surfaceArea = 2 * (myTrigleBase * myTriangleHeight) / 2 + (myTrigleBase + myTrigleSide1 + myTrigleSide2);
				
		//Volume of the prism = Area of base X Height of the prism = 1/2 base * height * height of the Prism.
		double volume =  (myTrigleBase * myTriangleHeight * myHeight) / 2;
		setVolume(volume);
		setSurfaceArea(surfaceArea);
		
	}
	//this overrides setName method in ThreedimesionalShape
	@Override
	public void setName() {
		myName = "TRINAGULAR_PRISM";		
	}
	
	@Override
	public void getDimensionsFromUserJpanel() {
		
		JFrame dialogFrame = new JFrame("panel");
		JLabel labelTrigleBase = new JLabel("Please enter the base of the base triangle: ");
		JLabel labelTrigleSide1 = new JLabel("Please enter the side1 of the base triangle: ");
		JLabel labelTrigleSide2 = new JLabel("Please enter the side2 of the base triangle: ");
		JLabel labelTriangleHeight = new JLabel("Please enter the height of the base triangle: ");
		JLabel labelHeight = new JLabel("Please enter the height of the Prism: ");
		
		JTextField textTrigleBase = new JTextField(20);
		JTextField textTrigleSide1 = new JTextField(20);
		JTextField textTrigleSide2 = new JTextField(20);
		JTextField textTriangleHeight = new JTextField(20);
		JTextField textHeight = new JTextField(20);
		JButton buttonCalculate = new JButton("Calculate");
		JPanel panel = new JPanel(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(10, 10, 10, 10);

		// add components to the panel
		constraints.gridx = 0;
		constraints.gridy = 0;
		panel.add(labelTrigleBase, constraints);
		
		// add components to the panel
		constraints.gridx = 0;
		constraints.gridy = 1;
		panel.add(textTrigleBase, constraints);
		
		
		// add components to the panel
		constraints.gridx = 0;
		constraints.gridy = 2;
		panel.add(labelTrigleSide1, constraints);
		
		// add components to the panel
		constraints.gridx = 0;
		constraints.gridy = 3;
		panel.add(textTrigleSide1, constraints);
		
		
		// add components to the panel
		constraints.gridx = 0;
		constraints.gridy = 4;
		panel.add(labelTrigleSide2, constraints);
		
		// add components to the panel
		constraints.gridx = 0;
		constraints.gridy = 5;
		panel.add(textTrigleSide2, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 6;
		panel.add(labelTriangleHeight, constraints);
		
		// add components to the panel
		constraints.gridx = 0;
		constraints.gridy = 7;
		panel.add(textTriangleHeight, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 8;
		panel.add(labelHeight, constraints);
		// add components to the panel
		constraints.gridx = 0;
		constraints.gridy = 9;
		panel.add(textHeight, constraints);
		
		// add components to the panel
		constraints.gridx = 0;
		constraints.gridy = 10;
		panel.add(buttonCalculate, constraints);

		buttonCalculate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				try {
					myTrigleBase = Integer.parseInt(textTrigleBase.getText());
					myTrigleSide1 = Integer.parseInt(textTrigleSide1.getText());
					myTrigleSide2 = Integer.parseInt(textTrigleSide2.getText());
					myTriangleHeight = Integer.parseInt(textTriangleHeight.getText());
					myHeight = Integer.parseInt(textHeight.getText());
				} catch (Exception e) {
					//do nothing 
				}
				calculateAreaAndVolume();
				System.out.println(getResult());
				JOptionPane.showMessageDialog(dialogFrame, getResult());
			}
		});

		// set border for the panel
		panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),
				"Provide dimentions of the Shape"));

		dialogFrame.add(panel);
		dialogFrame.setSize(500, 500);
		dialogFrame.setVisible(true);
		
	}

}