import java.io.*;
class fact
{
    public void fac(int x)
    {
        int f=1,i;
        for(i=1;i<=x;i++)
        f*=i;
        System.out.println("Factorial of "+x+" is = "+f);
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,m;
        System.out.print("Enter the number{n}:- ");
        n=Integer.parseInt(br.readLine());
        System.out.print("Enter the number{m}:- ");
        m=Integer.parseInt(br.readLine());
        System.out.println();
        fact ob=new fact();
        ob.fac(n);
        ob.fac(m);
    }
}