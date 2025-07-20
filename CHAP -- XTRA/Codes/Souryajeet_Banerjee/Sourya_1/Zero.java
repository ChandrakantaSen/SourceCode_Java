import java.io.*;
class Zero
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,s=0;
        System.out.println("Enter the number");
        n=Integer.parseInt(br.readLine());
        while(n>0)
        {
            int r=n%10;
            n=n/10;
            if(r==0)
            {
                s=s+1;
            }
        }
        if(s>=1)
        {
            System.out.println("Yes zero is present in the number ");
        }
        else
        {
            System.out.println("No zero is present in the number ");
        }
    }
}