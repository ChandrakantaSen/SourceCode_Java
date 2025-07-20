import java.io.*;
class Pattern7
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,x;
        double c=0,j;
        System.out.println("Enter the loop number");
        n=Integer.parseInt(br.readLine());
        System.out.println("Enter the number");
        x=Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++)
        {
            j=(x+i);
            c = c + j/i;
        }
        System.out.print(c);
        System.out.print("  ");
    }
} 