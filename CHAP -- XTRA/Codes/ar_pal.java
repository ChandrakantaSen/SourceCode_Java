import java.io.*;
class ar_pal
{
    public static void main(String args[])throws IOException
    {
        int i,n,m,d,j,s=0; 
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
        System.out.println("Palindrome numbers in the array are as follows : - ");
        for(i=0;i<n;i++)
        {
            m=a[i];
            s=0;
            d=0;
            while(m>0)
            {
                d=m%10;
                s=(s*10)+d;
                m=m/10;
            }
            if(s==a[i])
            {
                z++;
                System.out.println(a[i]);   
            }
        }
        System.out.println("Number of Palindrome numbers in the array are as follows : - "+z);
    }     
}
