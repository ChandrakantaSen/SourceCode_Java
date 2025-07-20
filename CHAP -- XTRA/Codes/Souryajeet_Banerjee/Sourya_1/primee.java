import java.io.*;
public class primee
{
    void check(int n)
    {
        int f=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                f+=1;
            }
        }
        if(f==1)
        {
            System.out.println(n+" is a prime number.");
        }
        else
        {
            System.out.println(n+" is not a prime number.");
        }
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int g;
        System.out.print("Enter the number{g}:- ");
        g=Integer.parseInt(br.readLine());
        primee ob=new primee();
        ob.check(g);
    }
}