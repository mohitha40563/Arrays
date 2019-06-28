package Arrayfundamentals;

public class Ar9 
{
	public static void main(String args[])
	{
		int a=args.length;
		int i,j;
		int ar[][]=new int[4][4];
		if(a<4)
			System.out.println("Enter 4 values");
		
		if(a==4)
		{
			int k=0;
			for(i=0;i<2;i++)
			{
				for(j=0;j<2;j++)
				{
					ar[i][j]=Integer.parseInt(args[k]);
					k++;
				}
			}
			
			System.out.println("given array is: ");
			for(i=0;i<2;i++)
			{
				for(j=0;j<2;j++)
				{
					System.out.print(ar[i][j]+" ");
				}
				System.out.println();
			}
			
			
			System.out.println("\nArray elements after reversing are: ");
			for(i=1;i>=0;i--)
			{
				for(j=1;j>=0;j--)
				{
					System.out.print(ar[i][j]+" ");
				}
				System.out.println();
			}
		}
		
	}

}
