import java.io.*;
class square_do
{
     public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            double i=1,n,s=0;
            System.out.println("Enter the range of the numbers  ");
            n=Double.parseDouble(br.readLine());
            do
            {
                s=s+Math.pow(i,2);
                i++;
            }while(i<=n);
            System.out.println("Sum of the square series = "+s);
        }
    }
            