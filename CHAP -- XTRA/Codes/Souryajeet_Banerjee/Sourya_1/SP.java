import java.io.*;
class SP
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="";
        System.out.print("Enter the name ");
        s=br.readLine();
        int l=s.length();
        for(int i=l-1;i>=0;i--)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}