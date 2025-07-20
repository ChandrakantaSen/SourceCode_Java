import java.io.*;
class SPO
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="",s1="";
        System.out.print("Enter the name ");
        s=br.readLine();
        int l=s.length();
        int a=0;
        for(int i=l-1;i>=0;i--)
        {
            for(int j=a;j<=l-1;j++)
            {
                System.out.print(s.charAt(j));
            }
            a=a+1;
            System.out.println();
        }
    }
}