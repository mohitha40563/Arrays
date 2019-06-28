package Arrayfundamentals;

public class Ar3 
{
	public static void main(String args[])
	{
		int a[]= {12,34,67,90,7,43,56};
		int i,c=0;
		int s=Integer.parseInt(args[0]);
		for(i=0;i<a.length;i++)
		{
			if(a[i]==s)
			{
				c++;
				System.out.println("index of given number is: "+i);
			}
		}
		if(c==0)
			System.out.println("-1");
	}

}
