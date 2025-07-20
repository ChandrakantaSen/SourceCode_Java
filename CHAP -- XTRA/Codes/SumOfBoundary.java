/**
 * @author Kalyan Majumdar
 */

import java.util.*;

public class SumOfBoundary
{
    static Scanner sc = new Scanner(System.in);
    static Array2DFunctions af = new Array2DFunctions();
    
    public static void main(String[] args)
    {
        System.out.println("Enter the no. of rows & cols : ");
        int row = sc.nextInt();
        af.setRows(row);
        
        int col = sc.nextInt();
        af.setCols(col);
        
        int array[][] = new int[row][col];
        af.set2DArray(array);
        
        System.out.println("Enter the values one by one : ");
        
        array = af.readArray();
        
        System.out.println("\fOriginal Matrix -->\n");
        af.print();
        
    	System.out.print("\nSum of boundary columns : " + af.sumOfBoundary_Col());
    }
}