import java.io.*;
class Deleation
{
    public static void main(String args[])throws IOException
    {
        System.out.println("Array Deleation ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[]=new int [10],m,f=0;
        System.out.println("Enter the number ");
        for(int i=0;i<=9;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Enter the number you wand to searsh ");
        m=Integer.parseInt(br.readLine());
        for(int i=0;i<=9;i++)
        {
            if(a[i]==m)
            {
                f=f+1;
            }
        }
        System.out.println("Array after Deleation ");
        for(int i=0;i<=9;i++)
        {
            System.out.print(" "+a[i]);
        }
    }
}