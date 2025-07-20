import java.io.*;

class amicable
{
    public static void main(String[] args)throws IOException
    {
        int s1=0 , s2=0 , i=0;
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter two numbers:");
        int a=Integer.parseInt(in.readLine());
        int b=Integer.parseInt(in.readLine());

        for(i=1;i<=(a/2);i++)
        {
            if(a%i==0)
            {
                s1=s1+i;
            }
        }

        for(i=1;i<=(b/2);i++)
        {
            if(b%i==0)
            {
                s2=s2+i;
            }
        }

        if(s1==b && s2==a)
            System.out.println("Amicable numbers!!!");
        else
            System.out.println("Not Amicable numbers!!");

    }
}