import java.io.*;
class A_equal
{
     public static void main(String args[])throws IOException
     {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[]=new int [5],c=0,b[]=new int [5];
        for(int i=0;i<=4;i++)
        {
            System.out.print("Enter the number ");
            a[i]=Integer.parseInt(br.readLine());
        }
        for(int j=0;j<=4;j++)
        {
            System.out.print("Enter the number ");
            b[j]=Integer.parseInt(br.readLine());
        }
        for(int z=0;z<=4;z++)
        {
            if(a[z]==b[z])
            {
                c=c+1;
            }
        }
        if(c==5)
        {
            System.out.print("Arrays are  equal");
        }
        else
        {
            System.out.print("Arrays are not equal");
        }
    }
}