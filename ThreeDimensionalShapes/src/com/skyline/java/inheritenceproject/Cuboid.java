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
//Cuboid is a subclass of the abstract class ThreeDimensionalShape
public class Cuboid extends ThreeDimensionalShape { 
		
	int myLength;
	int myBreadth;
	int myHeight;
	//this overrides the method getDimensionsFromUser in ThreeDimensionalShape
	@Override
	public void getDimensionsFromUser() {
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Please enter the length of the Cuboid: ");
		myLength = inputReader.nextInt();
		System.out.println("Please enter the breadth of the Cuboid: ");
		myBreadth = inputReader.nextInt();
		System.out.println("Please enter the heigth of the Cuboid: ");
		myHeight = inputReader.nextInt();
		calculateAreaAndVolume();
	}
	 //this overrides method calculateAreaAndVolume from ThreeDimensionalShape
	@Override
	public void calculateAreaAndVolume() {
		double volume = myLength * myBreadth * myHeight;
		double surfaceArea = 2 * (myLength * myBreadth +  myLength * myHeight + myBreadth * myHeight);
		setVolume(volume);
		setSurfaceArea(surfaceArea);
	}
	//this overrides setName method in ThreedimesionalShape
	@Override
	public void setName() {
		myName = "CUBOID";		
	}
	
	@Override
	public void getDimensionsFromUserJpanel() {
		
		JFrame dialogFrame = new JFrame("panel");
		JLabel labelLength = new JLabel("Please enter the length of the Cuboid: ");
		JLabel labelBreadth = new JLabel("Please enter the breadth of the Cuboid: ");
		JLabel labelHeight = new JLabel("Please enter the heigth of the Cuboid: ");
		
		JTextField textLength = new JTextField(20);
		JTextField textBreadth = new JTextField(20);
		JTextField textHeight = new JTextField(20);
		JButton buttonCalculate = new JButton("Calculate");
		JPanel panel = new JPanel(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(10, 10, 10, 10);

		// add components to the panel
		constraints.gridx = 0;
		constraints.gridy = 0;

		panel.add(labelLength, constraints);
		// add components to the panel
		constraints.gridx = 0;
		constraints.gridy = 1;
		panel.add(textLength, constraints);
		
		
		// add components to the panel
		constraints.gridx = 0;
		constraints.gridy = 2;

		panel.add(labelBreadth, constraints);
		// add components to the panel
		constraints.gridx = 0;
		constraints.gridy = 3;
		panel.add(textBreadth, constraints);
		
		
		// add components to the panel
		constraints.gridx = 0;
		constraints.gridy = 4;

		panel.add(labelHeight, constraints);
		// add components to the panel
		constraints.gridx = 0;
		constraints.gridy = 5;
		panel.add(textHeight, constraints);
		
		// add components to the panel
		constraints.gridx = 0;
		constraints.gridy = 6;
		panel.add(buttonCalculate, constraints);

		buttonCalculate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				try {
					myLength = Integer.parseInt(textLength.getText());
					myBreadth = Integer.parseInt(textBreadth.getText());
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
