import java.io.*;
class A_s_max
{
   public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[]=new int [10],w=1;
        for(int i=0;i<=9;i++)
        {
            System.out.print("Enter the number ");
            a[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<=9;i++)
        {
            if(a[i]>w)
            {
                w=a[i];
            }
        }
        System.out.println("Maximum number = "+w);
    }
}