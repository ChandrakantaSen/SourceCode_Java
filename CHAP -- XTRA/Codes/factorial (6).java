import java.io.*;
class factorial
{
    int fact(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void main(String args[])throws IOException
    {
       factorial ob=new factorial();
       int p=1;
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter a number");
       int a=Integer.parseInt(br.readLine());
       p=ob.fact(a);
       System.out.println("factorial="+p);
    }
}
    