import java.io.*;
class A_s_max_min
{
   public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[]=new int [10],w1,w;;
        for(int i=0;i<=9;i++)
        {
            System.out.print("Enter the number ");
            a[i]=Integer.parseInt(br.readLine());
        }
        w1=a[0];
        w=a[0];
        for(int i=0;i<=9;i++)
        {
            if(a[i]>w1)
            {
                w1=a[i];
            }
            if(a[i]<w)
            {
                w=a[i];
            }
        }
        System.out.println("Maximum number = "+w1);
        System.out.println("Minimum number = "+w);
    }
}