import java.io.*;
class A_S_S1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[]=new int [10],w=1;
        for(int i=0;i<=9;i++)
        {
            System.out.print("Enter the number  ");
            a[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<=9;i++)
        {
            for(int j=0;j<9-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    w=a[j];
                    a[j]=a[j+1];
                    a[j+1]=w;
                }
            }
        }
        for(int i=0;i<=9;i++)
        {
            System.out.println(a[i]);
        }
    }
}