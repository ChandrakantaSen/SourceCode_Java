/*
 * Insertion Sort
 */
 
import java.util.*;
class insertion_sort
{
	public static void main(String args[])
	{
		int d,temp=0,i,j,k;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the number of  elements of the array:");
		d=sc.nextInt();
		int b[]= new int [d];
		
		for(i=0;i<d;i++)
		{
			System.out.println(" Enter the  elements in "+"  "+(i+1)+" "+"cell:");
			b[i]=sc.nextInt();
    	}
    	
    	for(i=0;i<d;i++)
    	{
        	for(j=0;j<i;j++)
        	{
        		if(b[j]>b[i])
        		{
            		temp=b[j];
            		b[j]=b[i];
            		
            		for(k=i;k>j;k--)
            		{
                		b[k]=b[k-1];
            		}
            		b[k+1]=temp;
        		}
            }
        }
        
        System.out.println("The sorted array is:-");
        for(i=0;i<d;i++)
        {
           System.out.println(b[i]);
        }
    }
}