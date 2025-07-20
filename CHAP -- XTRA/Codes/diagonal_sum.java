import java.io.*;
class diagonal_sum 
{
	public static void main (String args[])throws IOException
	{
	   BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
	   System.out.print("How many rows & Column :");   	     int r= Integer.parseInt(obj.readLine());
	 int a[] [] = new int [r][r];
	 int i,j,ds=0;
	 for(i=0;i<r;i++)
	 {
	 	for(j=0;j<r;j++)
	 	{
	       System.out.print("Enter Values : ");  
	       a[i][j]= Integer.parseInt(obj.readLine());		
	       	if(i==j)
	          ds+=a[i][j];	
	 	}
	 }
	 System.out.println("The Matrix is :");
	 for(i=0;i<r;i++)
	 {
	 	for(j=0;j<r;j++)
	 	{
	       System.out.print(a[i][j]);  	       
	       	System.out.print("   ");
	 	}
	 	System.out.println("");
	 }
	 	 
	System.out.println("The Diagonal Sum is = "+ds); 
	}
} 