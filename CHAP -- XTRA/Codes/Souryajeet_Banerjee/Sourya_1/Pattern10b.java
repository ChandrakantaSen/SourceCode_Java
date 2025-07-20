import java.io.*;
class Pattern10b
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("Enter the number of loop");
        n=Integer.parseInt(br.readLine());
        double a;
        System.out.println("Enter the number");
        a=Double.parseDouble(br.readLine());
        double c=1;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                c=c-a/i;
            }
            else
            {
                c=c+a/i;
            }
        }
        System.out.print(c);
    }
}