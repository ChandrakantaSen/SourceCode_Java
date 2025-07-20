import java.io.*;
class square_for
{
     public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            double i,n,s=0;
            System.out.println("Enter the range of the numbers  ");
            n=Double.parseDouble(br.readLine());
            for(i=1;i<=n;i++)
            {
                s=s+Math.pow(i,2);
            }
            System.out.println("Sum of the square series "+s);
        }
    }