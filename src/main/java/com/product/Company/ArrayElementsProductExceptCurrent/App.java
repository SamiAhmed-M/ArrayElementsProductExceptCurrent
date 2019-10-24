package com.product.Company.ArrayElementsProductExceptCurrent;

import java.util.ArrayList;
/**
 * 2Given an array of integers, return a new array such that each element at index i of 
 * the new array is the product of all the numbers in the original array except the 
 * one at i.For example, if our input was [1, 2, 3, 4, 5], the expected output would 
 * be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 *
 */
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        // Scanner Object
    	Scanner myObj = new Scanner(System.in);
    	System.out.println("Enter list of integer array elements separated by space or comma"); 
    	String [] arr = myObj.nextLine().split("[ ,]+");
    	myObj.close();
    	int prod = 1;
    	for (int j=0;j<arr.length;j++)
		{
			prod = prod * Integer.parseInt(arr[j]);
		}
    	ArrayList<Integer> al = new ArrayList<Integer>();
    	for (int i=0; i<arr.length; i++)
    	{
    		int bench = Integer.parseInt(arr[i]);
    	    int div = prod/bench;
    		al.add(div);
    	}
    	
    	// display the new array
    	for (int z=0;z<arr.length;z++)
    	{
    		System.out.print(al.get(z) + " ");
    	}
    }
}
