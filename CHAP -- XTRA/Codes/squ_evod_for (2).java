import java.io.*;
class squ_evod_for
{
     public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            double i,n,se=0,so=0;
            System.out.println("Enter the range of the numbers  ");
            n=Double.parseDouble(br.readLine());
            for(i=1;i<=n;i++)
            {
                if(i%2==0)
                {
                    se=se+Math.pow(i,2);
                }
                else
                {
                    so=so+Math.pow(i,2);
                }
            }
            System.out.println("Sum of even numbers =  "+se);
            System.out.println("Sum of odd numbers =  "+so);
        }
}
            