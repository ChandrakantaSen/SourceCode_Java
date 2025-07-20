/*
 * WAP to perform Bubble Sort 
 */

import java.util.*;

class Code4
{
	public static void main (String[] args)
	{
		int i,j,k;
		int p[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array elements: ");
		for(i=0;i<p.length;i++)
		{
			p[i] = sc.nextInt();
		}
		
		for(i=0;i<p.length-1;i++)
     	{
         	for(j=0;j<p.length-1;j++)
         	{
             	if(p[j]>p[j+1])
             	{
                	k = p[j];
                 	p[j] = p[j+1];
                 	p[j+1] = k;
                }
            }
        }
		
		System.out.println("\n--Sorted data--\n");
        for(i=0;i<p.length;i++)
        {
        	System.out.print(p[i]+" ");
        }
	}
}