import java.io.*;
class Array4
{
public static void main (String args[])throws IOException
    {
        int i,j,p,k ,l,n,sm;
        InputStreamReader x=new InputStreamReader(System.in);
        BufferedReader y=new BufferedReader(x);
        System.out.println("ENTER THE DIMENSION OF ARRAY");
        n=Integer.parseInt(y.readLine());
        int a[][]=new int[n][n];
        System.out.println("ENTER NOS IN AN ARRAY");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=Integer.parseInt(y.readLine());
            }
        }
                System.out.println("CONTENTS OF ARRAY ARE");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<(n-1);j++)
            {
                sm=a[i][j];
            }
        }
        }
	}