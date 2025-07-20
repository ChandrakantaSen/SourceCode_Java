import java.io.*;
class sort
{
	public static void main(String args[]) throws IOException
        {       
int n;
                
                int i,j,temp;
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter Size");
                n=Integer.parseInt(obj.readLine());
                int a[]= new int[n];
		System.out.println("Enter Values into Array");
	
        for (i=0;i<n;i++)
		{
			System.out.print("Enter Value : ");
			a[i]=Integer.parseInt(obj.readLine());
		}
		/**** sorting started *********/
                for(i=0;i<n-1;i++)
		{
                        for(j=i+1;j<n;j++)
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
                for(i=0;i<n;i++)
			System.out.print("  "+a[i]);
			System.out.println("");
	}
}
