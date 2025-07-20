import java.io.*;
class matrix1
{
public static void main(String args[])throws IOException
{
int x[][]=new int[3][3];
BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
    for(int i=0;i<3;i++)
        {
         for(int j=0;j<3;j++)
        {
            System.out.println("enter a no");
            x[i][j]=Integer.parseInt(obj.readLine());
        }
    }
    for(int i=0;i<3;i++)
        {
            int sr=0;
            for(int j=0;j<3;j++)
        {   
            sr=sr+x[i][j];
        }
        System.out.println("the sum of row number"+i+"is"+sr);
    }
    System.out.println();
    for(int k=0;k<3;k++)
        {
    int sc=0;
    for(int j=0;j<3;j++)
        {
            sc=sc+x[j][k];
        }
        System.out.println("sum of column number "+k+" is"+ sc);
    }
}
    }

    