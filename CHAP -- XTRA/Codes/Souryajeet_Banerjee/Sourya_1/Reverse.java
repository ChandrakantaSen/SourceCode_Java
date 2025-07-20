import java.io.*;
class Reverse
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,s=0;
        System.out.println("Enter the number");
        n=Integer.parseInt(br.readLine());
        while(n>0)
        {
            int r=n%10;
            n=n/10;
            s=(s*10)+r;
        }
        System.out.println(s);
    }
}