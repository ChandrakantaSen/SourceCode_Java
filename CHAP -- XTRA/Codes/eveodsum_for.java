import java.io.*;
class eveodsum_for
{
     public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int i,n,se=0,so=0;
            System.out.println("Enter the range of the numbers  ");
            n=Integer.parseInt(br.readLine());
            for(i=1;i<=n;i++)
            {
                if(i%2==0)
                {
                    se=se+i;
                }
                else
                {
                    so=so+i;
                }
            }
            System.out.println("Sum of even numbers =  "+se);
            System.out.println("Sum of odd numbers =  "+so);
        }
}
            