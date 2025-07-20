import java.io.*;
class ar_revrse
{
    public static void main(String args[])throws IOException
    {
        int i,n,m,d,s; 
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
        System.out.println("Reverse numbers in the array are as follows : - ");
        for(i=0;i<n;i++)
        {
            m=a[i];
            s=0;
            while(m>0)
            {
                d=m%10;
                s=(s*10)+d;
                m=m/10;
            }
            z++;
            System.out.println(s);
        }
        System.out.println("Number of Reverse numbers in the array are as follows : - "+z);
    }
}
