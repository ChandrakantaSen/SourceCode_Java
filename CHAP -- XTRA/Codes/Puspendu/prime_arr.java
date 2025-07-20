package Puspendu;

//Program to count the no. of prime elements in an array
import java.io.*;
public class prime_arr
{
    public static int isprime(int n)
    {
        int i,c=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
                c++;
        }
        if(c==2)
            return 1;
        else
            return 0;
    }

    public static void main()throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int ar[]=new int[5];
        int i,c=0;
        for(i=0;i<5;i++)
        {
            System.out.println("Enter the 5 elements");
            ar[i]=Integer.parseInt(br.readLine());
        }
        for(i=0;i<5;i++)
        {
            if(isprime(ar[i])==1)
                c++;
        }
        System.out.println("No. of prime values="+c);
    }
}

