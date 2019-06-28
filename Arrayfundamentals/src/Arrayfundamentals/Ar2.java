package Arrayfundamentals;

public class Ar2
{
      public static void main(String args[])
      {
    	  int a[]= {23,34,45,67};
    	  int i,max=0,min=0;
    	  for(i=0;i<a.length;i++)
    	  {
    		  if(min>a[i])
    			  min=a[i];
    		  else if(max<a[i])
    			  max=a[i];
    	  }
    	  System.out.println("Max ans Min values in an array are: "+max+" , "+min);
      }
}
