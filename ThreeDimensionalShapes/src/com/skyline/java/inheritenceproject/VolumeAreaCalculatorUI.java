package com.skyline.java.inheritenceproject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VolumeAreaCalculatorUI {

	// JFrame
	private static JFrame myDialogFrame;

	// Create buttons to provide option for each of the 3-D shape
	static JButton Cube, Cuboid, Sphere, Triangular_Prism, Cone;

	// Label to display text
	static JLabel panelLable;

	// Main class
	public static void main(String[] args) {
        
		// Creating a new frame to store text field and
		// button
		myDialogFrame = new JFrame("panel");

		// Creating a label to display text
		panelLable = new JLabel("Click button to calculate the Area and Volume of the corresponding shape");
		// Creating a panel to add buttons
		JPanel dialogPanel = new JPanel(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(10, 10, 10, 10);

		ThreeDimensionalShape selectedShape;

		// Creating a new buttons
		Cube = new JButton("CUBE");
		Cube.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				Cube selectedShape = new Cube();
				selectedShape.getDimensionsFromUserJpanel();
			}
		});
		Cuboid = new JButton("CUBOID");
		Cuboid.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				Cuboid selectedShape = new Cuboid();
				selectedShape.getDimensionsFromUserJpanel();
			}
		});
		Sphere = new JButton("SPHERE");
		Sphere.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				Sphere selectedShape = new Sphere();
				selectedShape.getDimensionsFromUserJpanel();
			}
		});
		Triangular_Prism = new JButton("TRIANGULAR_PRISM");
		Triangular_Prism.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				TrianglularPrism selectedShape = new TrianglularPrism();
				selectedShape.getDimensionsFromUserJpanel();
			}
		});
		Cone = new JButton("CONE");
		Cone.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				Cone selectedShape = new Cone();
				selectedShape.getDimensionsFromUserJpanel();
			}
		});

		// add components to the panel
		constraints.gridx = 0;
		constraints.gridy = 0;
		dialogPanel.add(panelLable, constraints);
		constraints.gridx = 0;
		constraints.gridy = 1;
		dialogPanel.add(Cube, constraints);
		constraints.gridx = 0;
		constraints.gridy = 2;
		dialogPanel.add(Cuboid, constraints);
		constraints.gridx = 0;
		constraints.gridy = 3;
		dialogPanel.add(Sphere, constraints);
		constraints.gridx = 0;
		constraints.gridy = 4;
		dialogPanel.add(Triangular_Prism, constraints);
		constraints.gridx = 0;
		constraints.gridy = 5;
		dialogPanel.add(Cone, constraints);

		// set border for the panel
		dialogPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),
				"Select the Shape to calculate Area and Volume"));

		// Adding panel to frame
		myDialogFrame.add(dialogPanel);

		// Setting the size of frame
		myDialogFrame.setSize(500, 500);

		myDialogFrame.setVisible(true);
	}

}
