import java.io.*;
class ar_fac
{
    public static void main(String args[])throws IOException
    {
        int i,n,s,j;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array  ");
        n=Integer.parseInt(br.readLine());
        int a[]=new int[n];
        System.out.println("Enter the numbers in the array  ");
        for(i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("The numbers in the array are  ");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Factorial of the numbers in the array are as follows : - ");
        for(i=0;i<n;i++)
        {
            s=1;
            for(j=1;j<=a[i];j++)
            {
                s=s*j;
            }
                System.out.println(s);
            }
        }
    }
            