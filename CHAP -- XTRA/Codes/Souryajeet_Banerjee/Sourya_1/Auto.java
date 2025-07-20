import java.io.*;
class Auto
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,c=0;
        System.out.println("Enter the number");
        n=Integer.parseInt(br.readLine());
        int n1=n*n,n2=n;
        while(n>0)
        {
            n=n/10;
            c=c+1;
        }
        double r= Math.round(Math.pow(10,c));
        if(n1%r==n2)
        {
            System.out.println("Automorphic number = "+n2);
        }
        else
        {
            System.out.println("Not a Automorphic number = "+n2);
        }
    }
}
/*
 * import java.io.*;
class Autom
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("Enter the number");
        n=Integer.parseInt(br.readLine());
        for(int a=0;a<=n;a++)
        {
            int i=a,c=0;
            int i1=i*i,i2=i;
            while(i>0)
            {
                i=i/10;
                c=c+1;
            }
            double r= Math.round(Math.pow(10,c));
            if(i1%r==i2)
            {
                System.out.println("Automorphic number = "+i2);
            }
        }
    }
}
*/