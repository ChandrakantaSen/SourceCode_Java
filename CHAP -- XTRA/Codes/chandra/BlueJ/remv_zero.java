import java.io.*;
class remv_zero
{
    public static void main(String args[])throws IOException
    {
        int n,d,c=0;
        double sum=0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");
        n = Integer.parseInt(in.readLine());

        while(n!=0)
        {
            d=n%10;
            if(d!=0)
            {
                sum = sum + d*Math.pow(10,c);
                c++;
            }
            n=n/10;
        }
        System.out.println("Number is: "+sum);
    }
}