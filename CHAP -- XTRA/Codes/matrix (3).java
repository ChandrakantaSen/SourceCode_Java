import java.io.*;
class matrix
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int i,j;
            int a[][]={{1,2,3},{4,5,6},{7,8,9}};
            System.out.println("The values in the matrix are as follows: - ");
            for(i=0;i<3;i++)
            {
             for(j=0;j<3;j++)
            {
             System.out.print(a[i][j]+" "); 
            }
            System.out.println();
        }
        }
    }
               