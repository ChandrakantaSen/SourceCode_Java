import java.io.*;
class cub_evod_while
{
     public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            double i=1,n,se=0,so=0;
            System.out.println("Enter the range of the numbers  ");
            n=Double.parseDouble(br.readLine());
            while(i<=n)
            {
                if(i%2==0)
                {
                    se=se+Math.pow(i,3);
                    i++;
                }
                else
                {
                    so=so+Math.pow(i,3);
                    i++;
                }
            }
            System.out.println("Sum of even numbers =  "+se);
            System.out.println("Sum of odd numbers =  "+so);
        }
}
            