import java.io.*;
class P_525
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.print("Enter 1 or 2:");
        n=Integer.parseInt(br.readLine());
        if(n==1)
        {
            for(int i=0;i<=5;i++)
            {
                for(int j=0;j<=i;j++)
                {
                    System.out.print("*");
                } 
                System.out.println();
            }
        }
        else if(n==2)
        {
            for(int i=69;i>=65;i--)
            {
                for(int j=65;j<=i;j++)
                {
                    char ch=(char)(j);
                    System.out.print(ch);
                }
                System.out.println();
            }
        }
    }
}