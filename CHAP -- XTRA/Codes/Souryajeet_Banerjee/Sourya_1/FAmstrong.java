import java.io.*;
public class FAmstrong
{
    void fams(int n)
    {
        int s=0,n1=n;
        while(n>0)
        {
            int r=n%10;
            n=n/10;
            s=s+(r*r*r);
        }
        if(s==n1)
        {
            System.out.println("Amstrong number = "+s);
        }
        else
        {
            System.out.println("Not a Amstrong number = "+s);
        }
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int g;
        System.out.print("Enter the number{n}:- ");
        g=Integer.parseInt(br.readLine());
        FAmstrong ob=new FAmstrong();
        ob.fams(g);
    }
}