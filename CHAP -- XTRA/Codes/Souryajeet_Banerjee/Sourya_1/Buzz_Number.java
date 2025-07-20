import java.io.*;
class Buzz_Number
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("Enter the number");
        n=Integer.parseInt(br.readLine());
        int s=n%10;
        if(n%7==0)
        {
            System.out.println("Buzz number = "+n);
        }
        else if(s==7)
        {
            System.out.println("Buzz number = "+n);
        }
        else
        {
            System.out.println("Not a Buzz number .");
        }
    }
}