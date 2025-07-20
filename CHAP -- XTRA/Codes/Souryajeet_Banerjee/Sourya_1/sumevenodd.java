import java.io.*;
class sumevenodd
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,sum=0,num=0;
        System.out.println("Enter the number");
        for(int i=0;i<=5;i++)
        {
            n=Integer.parseInt(br.readLine());
            if(n%2==0)
            {
                sum=sum+n;
            }
            else
            {
                num=num+n;
            }
        }
        System.out.print("Sum of even numbers"+sum);
        System.out.print("Sum of odd numbers"+num);
    }
}