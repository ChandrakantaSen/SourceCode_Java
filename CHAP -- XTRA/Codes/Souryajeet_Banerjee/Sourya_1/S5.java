import java.io.*;
public class S5
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int s=0,a[]=new int[10];
        for(int i=0;i<=9;i++)
        {
            System.out.print("Enter the number ");
            a[i]=Integer.parseInt(br.readLine());
            s=s+a[i];
        }
        System.out.print(s);
    }
}