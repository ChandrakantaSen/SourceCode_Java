/**
 * @author Kalyan Majumdar
 */

import java.util.*;


public class Transpose
{
    static Scanner sc = new Scanner(System.in);
    static int row;
    static int col;
    static int array[][];
    static int tmp;
    
    public static void main(String[] args)
    {
        System.out.println("          Transpose Matrix");
        System.out.println("====================================");
        System.out.print("Enter the no. of rows & cols : ");
        row = sc.nextInt();
        col = row;
        array = new int[row][col];
        
        array = getMatrix(array);
        
        System.out.println("\nOriginal Matrix -->\n");
        printMatrix(array);
        
        System.out.println("\nAfter Transpose -->\n");
        printMatrix(transposeMatrix(array));
    }
    
    private static int[][] getMatrix(int[][] array)
    {
        System.out.println("Enter the values one by one : ");
        
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                try{
                	array[i][j] = sc.nextInt();
                	if(array[i][j] < 10)
                		continue;
                	else
                		throw new RangeException("Range Exception : Number should be less than 10 !!");
                }catch(RangeException re){
                	System.out.println(re.getMessage());
                	for(int t=0; t<100000000; t++);
                	for(int t=0; t<100000000; t++);
                	for(int t=0; t<100000000; t++);
                	for(int t=0; t<100000000; t++);
                	for(int t=0; t<100000000; t++);
                	for(int t=0; t<100000000; t++);
                	for(int t=0; t<100000000; t++);
                	for(int t=0; t<100000000; t++);
                	for(int t=0; t<100000000; t++);
                	for(int t=0; t<100000000; t++);
                	for(int t=0; t<100000000; t++);
                	for(int t=0; t<100000000; t++);
                	for(int t=0; t<100000000; t++);
                	System.out.println("Exiting ...");
                	System.exit(1);
                }
            }
        }
        
        return array;
    }
    
    private static void printMatrix(int[][] array)
    {
    	for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    private static int[][] transposeMatrix(int[][] array)
    {
    	for(int i = 0; i < row; i++)
        {
            for(int j = i; j < col; j++)
            {
                tmp = array[i][j];
            	array[i][j] = array[j][i];
            	array[j][i] = tmp;
            }
        }
        
        return array;
    }
    
    static class RangeException extends Exception
    {
        public RangeException(String msg)
        {
            super(msg);
        }
    }
}