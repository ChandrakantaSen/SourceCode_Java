import java.io.*;
class SPO1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="",s1="";
        System.out.print("Enter the name ");
        s=br.readLine();
        int l=s.length();
        for(int i=l-1;i>=0;i--)
        {
            s1=s1+s.charAt(i);
        }
        int l1=s1.length();
        for(int i=l1-1;i>=0;i--)
        {
            for(int j=i;j>=0;j--)
            {
                System.out.print(s1.charAt(j));
            }
            System.out.println();
        }
    }
}