import java.io.*;
class A_ssqaire
{
   public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[]=new int [10],w;
        for(int i=0;i<=9;i++)
        {
            System.out.print("Enter the number ");
            a[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<=9;i++)
        {
            w=a[i]*a[i];
            System.out.println(w);
        }
    }
}