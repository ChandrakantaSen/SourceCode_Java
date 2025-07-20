/**
 * @author Kalyan Majumdar
 */

import java.util.*;


public class Transpose2
{
    static Scanner sc = new Scanner(System.in);
    static int row;
    static int col;
    static int array[][];
    static int tmp;
    static Array2DFunctions af;// = new 
    
    public static void main(String[] args)
    {
        System.out.println("          Transpose Matrix");
        System.out.println("====================================");
        System.out.print("Enter the no. of rows & cols : ");
        row = sc.nextInt();
        col = row;
        array = new int[row][col];
        
        af = new Array2DFunctions(array, row, col);
        
        System.out.println("Enter the terms : ");
        array = af.readArray();
        
        System.out.println("\nOriginal Matrix -->\n");
        af.print();
        
        System.out.println("\nAfter Transpose -->\n");
        af.set2DArray(af.transposeMatrix());
        af.print();
    }
}