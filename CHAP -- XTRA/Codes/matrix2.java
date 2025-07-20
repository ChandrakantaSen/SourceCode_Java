import java.io.*;
class matrix2 extends matrix1
{
    int c[][]=new int [5][5];
    matrix2()
    {
        super();
        c[][]=
    }
    void findproduct()
    {
        if(m==r)
        {
            for(i=0;i<n;i++)
            {
                for(j=0;j<c;j++)
                {
                    c[i][j]+=a[i][j]*b[i][j];
                }
        }
        else
        {
            System.out.println("The multiplication of matrix a & matrix b is not possible : ");
        }
        
