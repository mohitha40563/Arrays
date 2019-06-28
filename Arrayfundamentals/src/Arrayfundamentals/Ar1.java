package Arrayfundamentals;

import java.util.Scanner;

public class Ar1
{
	public static void main(String args[])
	{
		int a,i,s=0;
		float avg;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no.of elements in the array:");
		a=sc.nextInt();
		
		int n[]=new int[a];
		System.out.println("Enter elements:");
		
		for(i=0;i<a;i++)
		{
			n[i]=sc.nextInt();
			s=s+n[i];
		}
		avg=(float)s/a;
		System.out.println("Sum and Avg of given array is: "+s+" , "+avg);
	}

}
