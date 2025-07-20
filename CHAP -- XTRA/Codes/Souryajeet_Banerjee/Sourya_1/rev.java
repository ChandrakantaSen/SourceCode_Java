import java.io.*;
public class rev
{
    void check(int n)
    {
        int f=0,n1=n,s=0;
        while(n>0)
        {
            int r=n%10;
            n=n/10;
            s=s*10+r;
        }
        System.out.println("Reverse of "+n1+" = "+s+" .");
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int g;
        System.out.print("Enter the number{g}:- ");
        g=Integer.parseInt(br.readLine());
        rev ob=new rev();
        ob.check(g);
    }
}