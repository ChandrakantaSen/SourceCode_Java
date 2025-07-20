import java.io.*;
class Primed
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int s=0;
        int s1=0;
        System.out.println("Enter the value");
        int n=Integer.parseInt(br.readLine());
        while(n>0)
        {
            int r=n%10;
            for(int i=1;i<=r;i++)
            {
                if(r%i==0)
                {
                    s1=s1+1;
                }
                
            }
            if(s1==2)
            {
                s=s+r;
            }
            s1=0;
            n=n/10;
        }
        System.out.println("Sum of prime value in a number = "+s);
    }
}