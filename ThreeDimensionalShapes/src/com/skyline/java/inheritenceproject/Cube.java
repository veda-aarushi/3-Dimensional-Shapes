package com.skyline.java.inheritenceproject;

import java.util.Scanner;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//Cube is a subclass of the abstract class ThreeDimensionalShape
public class Cube extends ThreeDimensionalShape {
	
	int mySide;
	
	//this overrides the method getDimensionsFromUser in ThreeDimensionalShape
	@Override
	public void getDimensionsFromUser() {
		System.out.println("Please enter the side of the Cube: ");
		Scanner inputReader = new Scanner(System.in);
		mySide = inputReader.nextInt();	
	}
	
	
    //this overrides method calculateAreaAndVolume from ThreeDimensionalShape
	@Override
	public void calculateAreaAndVolume() {
		setVolume(Math.pow(mySide, 3));
		setSurfaceArea(6 * mySide * mySide);		
	}
	
   //this overrides setName method in ThreedimesionalShape
	@Override
	public void setName() {
		myName = "CUBE";		
	}
	
	@Override
	public void getDimensionsFromUserJpanel() {
		
		JFrame dialogFrame = new JFrame("panel");
		JLabel labelSide = new JLabel("Please enter the side of the Cube: ");
		JTextField textSide = new JTextField(20);
		JButton buttonCalculate = new JButton("Calculate");
		JPanel panel = new JPanel(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(10, 10, 10, 10);

		// add components to the panel
		constraints.gridx = 0;
		constraints.gridy = 0;

		panel.add(labelSide, constraints);
		// add components to the panel
		constraints.gridx = 0;
		constraints.gridy = 1;
		panel.add(textSide, constraints);
		// add components to the panel
		constraints.gridx = 0;
		constraints.gridy = 2;
		panel.add(buttonCalculate, constraints);

		buttonCalculate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				try {
					mySide = Integer.parseInt(textSide.getText());
				} catch (Exception e) {
					//do nothing 
				}
				calculateAreaAndVolume();
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
