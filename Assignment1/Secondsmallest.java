package Assaignment1;

import java.util.Arrays;

public class Secondsmallest {

	public static int getSecondSmallest(int[] a,int total) 
	{
	    Arrays.sort(a);
	    return a[1];
	}
	public static void main(String args[])
	{
	int a[]= {23,45,67,32,89,22};
	System.out.println("Secondsmallest number is:" + getSecondSmallest(a,6));
	}
}
