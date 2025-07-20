import java.io.*;
class Auto1
{   
    void check(int n)
    {
        int n1=n*n,n2=n,c=0;
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
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int g;
        System.out.print("Enter the number{g}:- ");
        g=Integer.parseInt(br.readLine());
        Auto1 ob=new Auto1();
        ob.check(g);
    }
}