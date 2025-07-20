import java.io.*;
class Binary
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[]=new int [10],t;
        for(int i=0;i<=9;i++)
        {
            System.out.print("Enter the number  ");
            a[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<=9;i++)
        {
            for(int j=0;j<9-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.print("Array after Bubble shorting =");
        for(int i=0;i<=9;i++)
        {
            System.out.print(" "+a[i]);
        }
    }
}