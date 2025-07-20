import java.io.*;
class A_Marging
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[]=new int [6],b[]=new int [4],c[]=new int [10],m=0;
        for(int i=0;i<=5;i++)
        {
            System.out.print("Enter the number ");
            a[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<=3;i++)
        {
            System.out.print("Enter the number ");
            b[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<=5;i++)
        {
            c[i]=a[i];
        }
        for(int i=6;i<=9;i++)
        {
            c[i]=b[m];
            m =m+1;
        }
        System.out.println("Array after marging ");
        for(int i=0;i<=9;i++)
        {
            System.out.println(c[i]);
        }
    }
}