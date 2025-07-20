import java.io.*;
class BuzzNumber
{
    public static void main(String args[])throws IOException
    {
        int n;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Muuh Kya Dekhre ho Number Dallo");
        n=Integer.parseInt(br.readLine());
        if((n%7==0)||(n%10==7))
        {
            System.out.println("Buzz Number");
        }
        else
        {
            System.out.println("Not a Buzz Number");
        }
    }
}
