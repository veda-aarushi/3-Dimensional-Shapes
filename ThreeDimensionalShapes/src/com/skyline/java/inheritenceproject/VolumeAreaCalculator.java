package com.skyline.java.inheritenceproject;

import java.util.Scanner;

public class VolumeAreaCalculator {
	
	public static void main(String[] args) {
		
		ThreeDimensionalShape selectedShape = null;
		
		while (null == selectedShape) {
			int selectedShapeIndex = selectShapeIndex();
			selectedShape = createShapeAndCalculate(selectedShapeIndex);
			System.out.println(selectedShape.toString());
		}
	}

	private static int selectShapeIndex() {
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Please select Index of the shape for which you would like to calculate the Area and Volume: ");
		System.out.println(" 1. CUBE");
		System.out.println(" 2. CUBOID");
		System.out.println(" 3. SPHERE");
		System.out.println(" 4. TRIANGULAR_PRISM");
		System.out.println(" 5. CONE");
		int selectedShapeIndex = inputReader.nextInt();
		return selectedShapeIndex;
	}

	private static ThreeDimensionalShape createShapeAndCalculate(int selectedShapeIndex) {
		ThreeDimensionalShape selectedShape;
		//the specific object is instantiated based on the selected index
		//the object used is from VolumeAreaCalculator class
		//the object is instantiated in the subclasses so it will use the overrode methods
		switch (selectedShapeIndex) {
			case 1: {
				selectedShape = new Cube();
				selectedShape.getDimentionsAndCalculateAreaVolume();
				break;
			}
			case 2: {
				
				selectedShape = new Cuboid();
				selectedShape.getDimentionsAndCalculateAreaVolume();
				break;
			}
			case 3: {
				
				selectedShape = new Sphere();
				selectedShape.getDimentionsAndCalculateAreaVolume();
				break;
			}
			case 4: {
				
				selectedShape = new TrianglularPrism();
				selectedShape.getDimentionsAndCalculateAreaVolume();
				break;
			}
			case 5: {
				
				selectedShape = new Cone();
				selectedShape.getDimentionsAndCalculateAreaVolume();
				break;
			}
			default: {
				System.out.println("Unexpected value " + selectedShapeIndex + " Please select an index from the given options.");
				selectedShape = null;
				break;
			}
		}
		return selectedShape;
	}

}
