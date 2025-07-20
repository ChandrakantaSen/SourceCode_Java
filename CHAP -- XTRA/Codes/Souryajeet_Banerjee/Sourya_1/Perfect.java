import java.io.*;
 class Perfect
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,s=0;
        System.out.println("Enter the number");
        n=Integer.parseInt(br.readLine());
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                s=s+i;
            }
        }
        if(n==s)
        {
            System.out.println("Perfect number"+s);
        }
        else
        {
            System.out.println("Not a Perfect number"+s);
        }
    }
}