package Arrayfundamentals;

public class Ar10 
{
	public static void main(String args[])
	{
		int a=args.length;
		int i,j,max=0;
		int ar[][]=new int[3][3];
		if(a<9)
			System.out.println("Enter 9 values");
		
		if(a==9)
		{
			int k=0;
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					ar[i][j]=Integer.parseInt(args[k]);
					k++;
				}
			}
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					if(max<ar[i][j])
						max=ar[i][j];
				}
			}
			System.out.println("Max element in the given 3*3 arrray is: "+max);
		}
	}
}
