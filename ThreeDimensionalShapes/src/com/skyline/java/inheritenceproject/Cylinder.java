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

public class Cylinder extends ThreeDimensionalShape { 
		
	int myRadius;
	int myHeight;
	//this overrides the method getDimensionsFromUser in ThreeDimensionalShape
	@Override
	public void getDimensionsFromUser() {
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Please enter the radius of the Sphere: ");
		myRadius = inputReader.nextInt();
		System.out.println("Please enter the height of the Sphere: ");
		myHeight = inputReader.nextInt();
		calculateAreaAndVolume();
	}
	 //this overrides method calculateAreaAndVolume from ThreeDimensionalShape
	@Override
	public void calculateAreaAndVolume() {
		double surfaceArea = 2 * Math.PI * myRadius * (myRadius + myHeight);
		double volume = Math.PI * Math.pow(myRadius, 2) * myHeight;
		setVolume(volume);
		setSurfaceArea(surfaceArea);
	}
    //this overrides setName method in ThreedimesionalShape
	@Override
	public void setName() {
		myName = "CYLINDER";		
	}
	
	@Override
	public void getDimensionsFromUserJpanel() {
		
		JFrame dialogFrame = new JFrame("panel");
		JLabel labelRadius = new JLabel("Please enter the radius of the Sphere: ");
		JLabel labelHeight = new JLabel("Please enter the height of the Sphere: ");
		
		JTextField textRadius = new JTextField(20);
		JTextField textHeight = new JTextField(20);
		JButton buttonCalculate = new JButton("Calculate");
		JPanel panel = new JPanel(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(10, 10, 10, 10);

		// add components to the panel
		constraints.gridx = 0;
		constraints.gridy = 0;

		panel.add(labelRadius, constraints);
		// add components to the panel
		constraints.gridx = 0;
		constraints.gridy = 1;
		panel.add(textRadius, constraints);
		
		
		// add components to the panel
		constraints.gridx = 0;
		constraints.gridy = 0;

		panel.add(labelHeight, constraints);
		// add components to the panel
		constraints.gridx = 0;
		constraints.gridy = 1;
		panel.add(textHeight, constraints);
		
		// add components to the panel
		constraints.gridx = 0;
		constraints.gridy = 2;
		panel.add(buttonCalculate, constraints);

		buttonCalculate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				try {
					myRadius = Integer.parseInt(textRadius.getText());
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
