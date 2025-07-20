import java.io.*;
class ar_sum
{
    public static void main(String args[])throws IOException
    {
        int i,n,s,j,m;
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
        System.out.println("Sum of the digits of the numbers in the array are as follows : - ");
        for(i=0;i<n;i++)
        {
            s=0;
            m=a[i];
            int d=0;
            while(m>0)
            {
             d=m%10;
             s=s+d;
             m=m/10;
            }
                System.out.println("The sum of the digits upto  is = " +s);
            }
        }
    }