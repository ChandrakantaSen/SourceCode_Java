/*
 * WAP
 */

 import java.util.*;

 class Code5
 {
 	public static void main (String[] args)
 	{
 		String names[] = new String[5];
		int marks[] = new int[5];
		int i,j,flag = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println(":Enter the Student names:");
		for(i=0; i<5; i++)
		{
			names[i] = sc.next();
		}

		System.out.println(":Enter the Student marks:");
		for(j=0; j<5; j++)
		{
			marks[j] = sc.nextInt();
		}

    	int n = marks.length;
    	int m = names.length;
    	int temp = 0;
    	String temp1 = null;

    	for (i = 0; i < n; i++)
    	{
        	for (j = 1; j < (n - i); j++)
        	{
            	if (marks[j - 1] < marks[j])
            	{
                	// swap elements
                	temp = marks[j - 1];
                	marks[j - 1] = marks[j];
                	marks[j] = temp;
                	temp1 = names[j - 1];
                	names[j - 1] = names[j];
                	names[j] = temp1;
            	}
        	}
    	}

        System.out.println("\n\n\nSorted List\n\n");
        System.out.println("Students              Marks");
        System.out.println("____________________________");
        for(i = 0; i < marks.length; i++)
            System.out.println(names[i] + "          -          " + marks[i]);
	}
 }