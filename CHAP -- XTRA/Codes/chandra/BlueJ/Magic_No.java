import java.io.*;
class Magic_No
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a,d;
        int sum;
        System.out.println("Enter the number:");
        a=Integer.parseInt(br.readLine());
        while(true)
        {
            sum=0;
            if(a<10)
            {
                break;
            }
            else
            {
                while(a>0)
                {
                    d = a%10;
                    sum=sum+d;
                    a=a/10;
                }
                a=sum;
            }
        }
        if(a==1)
        {
            System.out.println("The number is a magic number.");
        }
        else
        {
            System.out.println("The number is not a magic number.");
        }
    }
}

