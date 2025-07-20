import java.io.*;
class A_PSqare
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
        System.out.println("Perfect Sqare =");
        for(int i=0;i<=9;i++)
        {
            for(int j=0;j<=a[i];j++)
            {
                if(j*j==a[i])
                {
                    System.out.print(" "+a[i]);
                }
            }
        }
    }
}