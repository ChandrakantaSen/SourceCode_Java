import java.io.*;
class positive_negative_zero
{
    public static void main(String args[])throws IOException
    {
        int a;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number ");
        a=Integer.parseInt(br.readLine());
        if(a>0)
        {
            System.out.println("The number is positive ");
        }
        else if(a==0)
        {
            System.out.println("The number is zero ");
        }
        else
        {
             System.out.println("The number is negative ");
            }
    }
}

            