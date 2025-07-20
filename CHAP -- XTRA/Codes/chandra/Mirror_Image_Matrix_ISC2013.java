/**
 * Write a program to declare a square matrix A[ ] [ ] of order (M x M) 
 * where ‘M’ is the number of rows and the number of columns 
 * such that M must be greater than 2 and less than 20. 
 * Allow  the user to input integers into this matrix. 
 * Display appropriate error message for an invalid input. 
 * Perform the following tasks:
 * (a) Display the input matrix.
 * (b) Create a mirror image matrix.
 * (c) Display the mirror image matrix.
 * 
 * Example 1 :- 
 * INPUT : M = 3
 * 4       16      12
 * 8       2       14
 * 4       1        3
 * 
 * OUTPUT :-
 * ORIGINAL MATRIX
 * 4       16       12
 * 8       2        14
 * 4       1        3
 * 
 * MIRROR IMAGE MATRIX
 * 12      16      4
 * 14      2       8
 * 3       1       4
 **/

import java.io.*;

class Mirror_Image_Matrix_ISC2013
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size of the square matrix : ");
        int m=Integer.parseInt(br.readLine());

        if(m>2 && m<20) 
        {
            int A[][]=new int[m][m];
            System.out.println("Enter the elements of the Matrix : ");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    A[i][j]=Integer.parseInt(br.readLine());
                }
            }
            System.out.println("*********************");
            System.out.println("The original matrix:");
            System.out.println("*********************");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.print(A[i][j]+" ");
                }
                System.out.println();
            }

            // creating the Image Matrix
            int B[][]=new int[m][m];
            for(int i=0;i<m;i++)
            {
                int k=0;
                for(int j=m-1;j>=0;j--)
                {
                    B[i][k]=A[i][j];
                    k++;
                }
            }

            //Printing both the Matrix
            System.out.println("*********************");
            System.out.println("The Mirror Image:");
            System.out.println("*********************");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.print(B[i][j]+" ");
                }
                System.out.println();
            }
        }
        else
            System.out.println("Output : Size Out Of Range");
    }
}
