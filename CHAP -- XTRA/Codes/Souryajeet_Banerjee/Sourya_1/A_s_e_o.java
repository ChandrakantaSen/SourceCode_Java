import java.io.*;
class A_s_e_o
{
   public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int s=0,c=0,a[]=new int [10];
        for(int i=0;i<=9;i++)
        {
            System.out.print("Enter the number ");
            a[i]=Integer.parseInt(br.readLine());
            if(a[i]%2==0)
            {
                c=c+a[i];
            }
            else
            {
                s=s+a[i];
            }
        }
        System.out.print("Sum of odd  numbers = "+s);
        System.out.print("Sum of even numbers = "+c);
    }
}