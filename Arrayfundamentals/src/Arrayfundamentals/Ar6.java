package Arrayfundamentals;

import java.util.Arrays;

public class Ar6 
{
	public static void main(String args[])
	{
		int a[]= {12,89,57,9,58};
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+",");
	}

}
