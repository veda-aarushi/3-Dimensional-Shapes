package com.skyline.java.inheritenceproject;

//abstract class that implements the interface
public abstract class ThreeDimensionalShape implements Shape {

	public String myName = "3-D-SHAPE";
    private double myVolume;
    private double mySurfaceArea;
    
    // Since the dimensions are specific to the shape 
    // this method is overrode in all subclasses to take 
    // the dimensions as input from user
    public abstract void getDimensionsFromUser();

    // Since the dimensions are specific to the shape 
    // this method is overrode in all subclasses to take 
    // the dimensions as input from user using Jpanel / UI based inputs
    public abstract void getDimensionsFromUserJpanel();
    
    // Override the method to perform calculation of Area and Volume 
    // for the specific shape
    public abstract void calculateAreaAndVolume();
    
    // Override to set the name of the specific shape
    public abstract void setName();
    
    // Set the name and dimentions in the constructor 
    public ThreeDimensionalShape () {
    	setName();
    }
 
    public void getDimentionsAndCalculateAreaVolume() {
    	getDimensionsFromUser();
    	calculateAreaAndVolume();
    }
    //the default implementation of the implemented interface (getSurfaceArea from interface)
    @Override
    public double getSurfaceArea() {
    	return mySurfaceArea;
    }
    
    public void setVolume(double volume) {
    	myVolume = volume;
    }
    
    public void setSurfaceArea(double area) {
    	mySurfaceArea = area;
    }
  //the default implementation of the implemented interface (getVolume from interface)
    @Override
    public double getVolume() {
    	return myVolume;
    }
    
    public String getName() {
    	return myName;
    }
    //method that overrides toString method from point    
    @Override
    public String toString() {
    	
    	return "Shape of the 3-D Object: " + myName + "\n"
    			+ "Volume of the Object: " + getVolume() + "\n"
    			+ "Surface Area of the Object: " + getSurfaceArea();
    }
    
    public String getResult() {
    	
    	return "Shape of the 3-D Object: " + myName + "\n"
    			+ "Volume of the Object: " + getVolume() + "\n"
    			+ "Surface Area of the Object: " + getSurfaceArea();
    }
    
}
