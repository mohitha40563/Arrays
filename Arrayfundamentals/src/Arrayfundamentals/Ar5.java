package Arrayfundamentals;

import java.util.Arrays;

public class Ar5
{
	public static void main(String args[])
	{
		int a[]= {23,34,12,23,56,78,10};
	    Arrays.sort(a);
	    System.out.println("Smallest numbers are: ");
	    
	    for(int i=0;i<2;i++)
	    	System.out.println(a[i]);
	    
	    System.out.println("Largest numbers are: ");
	    
	    for(int i=a.length-1;i>a.length-3;i--)
	    	System.out.println(a[i]);
	}

}
