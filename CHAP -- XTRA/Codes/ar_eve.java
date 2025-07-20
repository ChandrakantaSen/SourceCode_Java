import java.io.*;
class ar_eve
{
    public static void main(String args[])throws IOException
    {
        int i,n,z;
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
                    z=0;
        System.out.println("Even numbers in the array are as follows : - ");
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                z++;
                System.out.println(a[i]);
            }
        }
                System.out.println("Number of even numbers in the array are "+z);   }
}
