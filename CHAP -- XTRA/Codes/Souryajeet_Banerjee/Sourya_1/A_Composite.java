import java.io.*;
class A_Composite
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[]=new int [10],c=0;
        for(int i=0;i<=9;i++)
        {
            System.out.print("Enter the number ");
            a[i]=Integer.parseInt(br.readLine());
        }
        System.out.print(" Composite number =");
        for(int i=0;i<=9;i++)
        {
            for(int j=1;j<=a[i];j++)
            {
                if(a[i]%j==0)
                {
                    c=c+1;
                }
            }
            if(c!=2)
            {
                System.out.print("  "+a[i]);
            }
            c=0;
        }
    }
}