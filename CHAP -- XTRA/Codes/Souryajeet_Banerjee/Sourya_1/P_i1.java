import java.io.*;
class P_i1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("Enter any odd number");
        n=Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i=i+2)
        {
           for(int g=n-i+1;g>=1;g=g-2)
           {  
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++)
           {  
               System.out.print("*");
           }
            System.out.println();
        }
        for(int i=1;i<=n+2;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        System.out.print(" ");
        for(int i=n;i>=1;i=i-2)
        {
           for(int g=1;g<=n-i;g=g+2)
           {  
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++)
           {  
               System.out.print("*");
           }
            System.out.println();
            System.out.print(" ");
        }
    }
}