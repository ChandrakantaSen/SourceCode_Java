// array_sorting.java
import java.io.*;
class array_sorting
{
	public static void main(String args[]) throws IOException
	{
		int a[]= new int[10],i,j,temp;
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Values into Array");
		for (i=0;i<10;i++)
		{
			System.out.print("Enter Value : ");
			a[i]=Integer.parseInt(obj.readLine());
		}
		/**** sorting started *********/
		for(i=0;i<9;i++)
		{
			for(j=i+1;j<10;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		/**** sorting completed ********/
		System.out.println("Sorted Numbers...\n\n");
		for(i=0;i<10;i++)
			System.out.print("  "+a[i]);
			System.out.println("");
	}
}
