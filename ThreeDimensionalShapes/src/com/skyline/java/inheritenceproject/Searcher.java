package com.skyline.java.inheritenceproject;

public class Searcher {
	
	    public static void sort(int[] elem)
	            {
	        for (int j = 0; j < elem.length - 1; j++)
	        {
	            int minIndex = j;

	            for (  int k = j + 1; k < elem.length; k++ )
	            {
	                if (elem [k] < elem [minIndex])
	                {
	                    minIndex = k;
	                }
	            }
	            int temp = elem[j];
	            elem[j] = elem[minIndex];
	            elem[minIndex] = temp;
	        }
	    }

	    public static void main(String[] args)
	    {
	        int[] nums = {-30,-9,-6,-4,-2,-1,0,2,4,10,12,17,22,30};
	        Searcher.sort(nums);
	    }
		// TODO Auto-generated constructor stub
	}
