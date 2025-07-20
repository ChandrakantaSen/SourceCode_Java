import java.io.*;
class primeSeries
{
    public static void main(String args[])throws IOException
    {
        int lr,ur,c=0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the lower range: ");
        lr = Integer.parseInt(in.readLine());
        System.out.print("Enter the upper range: ");
        ur = Integer.parseInt(in.readLine());

        System.out.println("Prime Elements are: ");
        for(int i=lr;i<=ur;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                System.out.print(i+" ");
            }
            c=0;
        }
    }
}
