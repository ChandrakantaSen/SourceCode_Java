import java.io.*;
class prime  
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,i,count=0;
        System.out.println("Enter a number  ");
        n=Integer.parseInt(br.readLine());
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println(n+" IS A PRIME NUMBER ");
        }
        else
        {
            System.out.println(n+" IS NOT A PRIME NUMBER ");
        }
    }
}