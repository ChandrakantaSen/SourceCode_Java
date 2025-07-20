import java.io.*;
class A_seon
{
   public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double s=0,c=0,j=0,g,a[]=new double [10];
        for(int i=0;i<=9;i++)
        {
            System.out.print("Enter the number ");
            a[i]=Double.parseDouble(br.readLine());
            if(a[i]>0)
            {
                if(a[i]%2==0)
                {
                    c=c+a[i];
                }
                else
                {
                    s=s+a[i];
                }
            }
            else
            {
                j=j+a[i];
            }
        }
        g=j*-1;
        System.out.println("Sum of odd       numbers  =  "+s);
        System.out.println("Sum of even      numbers  =  "+c);
        System.out.println("Sum of negitive  numbers  =  "+g);
    }
}