import java.io.*;
class A_Smith
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[]=new int [10];
        for(int i=0;i<=9;i++)
        {
            System.out.print("Enter the number ");
            a[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<=9;i++)
        {
            double c=0,t=0,e=0;
            int b=a[i],b1=a[i];
            while(b>0)
            {
                b=b/10;
                t=t+1;
            }
            while(b1>0)
            {
                int r=b1%10;
                b1=b1/10;
                c=Math.pow(r,t);
                t=t-1;
                e=e*10+c;
            }
            if(e==a[i])
            {
                System.out.println("Smith number = "+a[i]);
            }
            b=0;
            b1=0;
        }
    }
}
/*
class Smith
{
    public static void main(String args[])
    {
        for(int i=0;i<=10000000;i++)
        {
            double c=0,t=0,e=0;
            int b=i,b1=i;
            while(b>0)
            {
                b=b/10;
                t=t+1;
            }
            while(b1>0)
            {
                int r=b1%10;
                b1=b1/10;
                c=Math.pow(r,t);
                t=t-1;
                e=e*10+c;
            }
            if(e==i)
            {
                System.out.println("Smith number = "+i);
            }
            b=0;
            b1=0;
        }
    }
}
*/