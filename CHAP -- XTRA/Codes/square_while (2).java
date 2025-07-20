import java.io.*;
class square_while
{
     public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            double i=1,n,s=0;
            System.out.println("Enter the range of the numbers  ");
            n=Double.parseDouble(br.readLine());
            while(i<=n)
            {
                s=s+Math.pow(i,2);
                i++;
            }
            System.out.println("Sum of the square series = "+s);
        }
    }
            