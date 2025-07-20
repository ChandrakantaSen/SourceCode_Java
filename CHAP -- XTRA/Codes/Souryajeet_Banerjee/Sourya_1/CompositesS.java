import java.io.*;
class CompositesS
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,c=0;
        System.out.println("Enter the number");
        n=Integer.parseInt(br.readLine());
        System.out.println("Composite number = ");
        for(int g=1;g<=n;g++)
        {
            for(int i=1;i<=g;i++)
            {
                if(g%i==0)
                {
                    c=c+1;
                }
            }
            if(c!=2)
            {
                System.out.print(g+" ");
            }
            c=0;
        }
    }
} 