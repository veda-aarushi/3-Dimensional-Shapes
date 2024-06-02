package com.skyline.java.inheritenceproject;

public class oddnumbersinstring {
   public static void main(String[] args) {
	   String[] myArray = {"1", "test1", "3", "test2", "4"};
	   int len  = myArray.length;
	   
	   for (int i = 0; i < len ; i++) {
		   int temp = -1;
		   
		   try {
			   temp = Integer.parseInt(myArray[i]);
		   }
		   catch (Exception e) {
			    continue;
		   } 
		   
		   if (temp % 2 == 1) {
			   System.out.println(myArray[i]);
		   }
		   else {
			   continue;
		   }
		   //System.out.println(myArray[i]);
		   
	   }
	   
	   
   }
}
