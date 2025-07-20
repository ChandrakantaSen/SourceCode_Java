import java.io.*;
class A_S_S2
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
            for(int j=i+1;j<9;j++)
            {
                if(a[i]>a[j])
                {
                    w=a[i];
                    a[i]=a[j];
                    a[j]=w;
                }
            }
        }
        for(int i=0;i<=9;i++)
        {
            System.out.println(a[i]);
        }
    }
}