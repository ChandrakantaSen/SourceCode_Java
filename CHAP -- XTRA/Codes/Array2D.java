/**
 * @author Kalyan Majumdar
 */

import java.util.*;

public class Array2D
{
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
    	System.out.println("Enter the no. of rows & cols : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
    	int array[][] = new int[row][col];
    	
    	System.out.println("Enter the values one by one : ");
    	for(int i = 0; i < row; i++)
    	{
    	    for(int j = 0; j < col; j++)
    	    {
    	        array[i][j] = sc.nextInt();
    	    }
    	}
    	
    	int col_s = 0;
    	
    	System.out.println("\fOriginal Matrix -->\n");
		for(int i = 0; i < row; i++)
    	{
    	    for(int j = 0; j < col; j++)
    	    {
    	        System.out.print(array[i][j] + " ");
    	    }
    	    System.out.println();
    	}
    	
    	System.out.print("\nSum of boundary columns : ");
    	for(int i = 0; i < row; i++)
    	{
    	    for(int j = 0; j < col; j++)
    	    {
    	        if(j == 0 || j == col-1)
    	        	col_s += array[i][j];
    	    }
    	}
    	System.out.println(col_s);
    }
}