import java.io.*;
class Lowest
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int min=999999;
        System.out.print("Enter the value: ");
        int n=Integer.parseInt(br.readLine());
        while(n>0)
        {
            int r=n%10;
            n=n/10;
            if(r<min)
            {
                min=r;
            }
        }
        System.out.println("Lowest disit: "+min+".");
    }
}