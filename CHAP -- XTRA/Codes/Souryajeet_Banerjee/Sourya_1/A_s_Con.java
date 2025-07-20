import java.io.*;
public class A_s_Con
{
   public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[]=new int [10];
        for(int i=0;i<=9;i++)
        {
            System.out.print("Enter the number ");
            a[i]=Integer.parseInt(br.readLine());
        }
        System.out.print("Consiqutive number ");
        for(int i=0;i<=8;i++)
        {
            if((a[i]-a[i+1]==1)||(a[i]-a[i+1]==-1))
            {
                System.out.println(a[i]);
                System.out.println(a[i+1]);
                System.out.println();
            }
        }
    }
}