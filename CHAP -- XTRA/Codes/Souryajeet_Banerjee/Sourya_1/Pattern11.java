import java.io.*;
class Pattern11
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n;
        double c=0,g,b;
        System.out.println("Enter the number");
        n=Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++)
        {
            g=(i+(i+1));
            b=(i*(i+1));
            c=c+(g/b);
        }
        System.out.println(c);
    }
}