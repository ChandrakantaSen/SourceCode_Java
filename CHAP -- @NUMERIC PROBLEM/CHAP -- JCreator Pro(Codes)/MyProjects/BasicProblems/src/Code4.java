/*
 * WAP to perform linear search using two different arrays
 */

 import java.util.*;

 class Code4
 {
 	public static void main (String[] args)
 	{
		int p[] = new int[5];
		int q[] = new int[5];
		int i,j,flag = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println(":Enter the elements in array 1:");
		for(i=0; i<5; i++)
		{
			p[i] = sc.nextInt();
		}

		System.out.println(":Enter the elements in array 2:");
		for(j=0; j<5; j++)
		{
			q[j] = sc.nextInt();
		}


		System.out.println("-- Searched Elements --");
		for(i=0; i<5; i++)
		{
			for(j=0; j<5; j++)
			{
				if(p[i] == q[j])
				{
					flag = 1;
				}

				if(flag == 1)
				{
					System.out.print(q[j] + " ");
				}
				flag = 0;
			}
		}
	}
 }