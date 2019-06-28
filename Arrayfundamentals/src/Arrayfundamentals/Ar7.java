package Arrayfundamentals;

import java.util.Arrays;

public class Ar7 
{
	public static void main(String args[])
	{
		int a[]= {12,3,4,12,45,45,3,90};
		int t[]=new int[8];
		int i,j=0;
		Arrays.sort(a);
		
		for(i=0;i<a.length-1;i++)
		{
			if(a[i] != a[i+1])
				t[j++]=a[i];
		}
		t[j++]=a[a.length-1];
		
		for(i=0;i<j;i++)
		{
			a[i]=t[i];
			System.out.print(a[i]+",");
		}
	}

}
