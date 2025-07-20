import java.io.*;
class S_ld
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String s="";
        String s1="";
        System.out.print("Enter the name ");
        s=br.readLine();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                s1=s1+s.charAt(i+1)+".";
            }
        }
        System.out.println(s1);
        int l=s1.length();
        for(int i=l-1;i>=0;i--)
        {
            System.out.print(s1.charAt(i));
        }
    }
}