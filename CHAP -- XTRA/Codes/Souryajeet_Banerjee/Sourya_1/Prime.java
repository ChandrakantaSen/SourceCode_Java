import java.io.*;
class Prime 
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,c=0;
        System.out.println("Enter the number");
        n=Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c=c+1;
            }
        }
        if(c==2)
        {
            System.out.println(" Prime number"+n);
        }
        else
        {
            System.out.println("Not a Prime number"+n);
        }
    }
} 