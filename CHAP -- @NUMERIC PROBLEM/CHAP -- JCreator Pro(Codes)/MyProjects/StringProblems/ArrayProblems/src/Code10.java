/*
 * WAP to enter the names of the students and their marks.
 * Arrange the names alphabetically and display the corresponding marks. 
 */

import java.util.Scanner;

class Code10
{
	public static void main (String[] args) 
	{
        int n,i;
        String str;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter number of strings: ");
        n = sc.nextInt();
        
        String names[] = new String[n];
        int marks[] = new int[n];
        
        System.out.println("Enter all strings: ");
        for(i = 0; i < n; i++)
        {
       		names[i] = sc.next();
        }
        
        System.out.println("Enter all marks: ");
        for(i = 0; i < n; i++)
        {
        	marks[i] = sc.nextInt();
        }
  
        for(i = 0; i < n; i++)
        {
            for(int b = i + 1; b < n; b++)
            {
                // java alphabetical sort
                if(names[i].compareTo(names[b]) > 0)
                {
                    str = names[i];
                    names[i] = names[b];
                    names[b] = str;
                }
            }
        }
        for(int a = 0; a < n; a++)
        {
            for(int b =0; b < n-a-1; b++)
            {
                // java alphabetical sort
                if(marks[b]>(marks[b+1]))
                {
                    int t=marks[b];
                    marks[b]=marks[b+1];
                    marks[b+1]=t;
                }
            }

        }
        System.out.println("After sorting names in an alphabetical order: ");
        for(int a = 0; a < n; a++)
        {
            System.out.println(names[a] + ", "+marks[a]);
        }
    }
}