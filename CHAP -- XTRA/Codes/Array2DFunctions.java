
/**
 * provides all (most of) functionality to work with a 2-D Integer Array (Matrix)
 * 
 * @author Kalyan Majumdar
 * @version 1.0
 */

import java.util.*;

public class Array2DFunctions
{
    private static Scanner sc = new Scanner(System.in);
    private static int row, col;
    private static int[][] array;
    
    public Array2DFunctions(int[][] array, int row, int col)
    {
        this.array = array;
        this.row = row;
        this.col = col;
    }
    
    public Array2DFunctions(int[][] array, int side)
    {
        this(array, side, side);
    }
    
    public Array2DFunctions()
    {
        this(null, 0, 0);
    }
    
    public final void set2DArray(int[][] array)
    {
        this.array = array;
    }
    
    public final void setRows(int row)
    {
        this.row = row;
    }
    
    public final void setCols(int cols)
    {
        this.col = cols;
    }
    
    public final void setDimensions(int row, int cols)
    {
        this.row = row;
        this.col = cols;
    }
    
    public final Position getDimensions()
    {
        return new Position(row, col);
    }
    
    public final int getRows()
    {
        return row;
    }
    
    public final int getCols()
    {
        return col;
    }
    
    public final int[][] get2DArray()
    {
        return array;
    }
    
    public final int[][] readArray()
    {
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
                    for(int t=0; t<100000000; t++);
                    for(int t=0; t<100000000; t++);
                    System.out.println("Exiting ...");
                    System.exit(1);
                }
            }
        }
    
        return array;
    }
        
    public final void print()
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
    
    public final int[][] transposeMatrix()
    {
        int tmp;
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
    
    public final int sumOfBoundary_Col()
    {
        int col_s = 0;
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(j == 0 || j == col-1)
                    col_s += array[i][j];
            }
        }
        
        return col_s;
    }
}

class RangeException extends Exception
{
    public RangeException(String msg)
    {
        super(msg);
    }
}