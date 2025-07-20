import java.io.*;
class ar_prime
{
    public static void main(String args[])throws IOException
    {
        int i,j,n,count;
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
        int z=0;
        System.out.println("Prime numbers in the array are as follows : - ");
        for(i=0;i<n;i++)
        {
            count=0;
            for(j=1;j<=a[i];j++)
            {
            if(a[i]%j==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            z++;
            System.out.println(a[i]);
        }
    }
    System.out.println("Number of Prime numbers in the array are as follows : - "+z);

}
    }