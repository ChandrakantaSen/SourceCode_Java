import java.io.*;
class S_B
{
    public static void main(String args[])throws IOException
    {
        String  s="",s1="",s2="";
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the name: ");
        s=br.readLine();
        s=s+" ";
        int n;
        s=s.toUpperCase();
        int l=s.length();
        for(int i=l-1;i>=0;i--)
        {
            s1=s1+s.charAt(i);
        }
        int l1=s1.length();
        for(int i=0;i<l1;i++)
        {
            for(int j=0;j<i;j++)
            {
                char ch=s1.charAt(i);
                System.out.print(s1.charAt(i));
            }
            System.out.println();
        }
    }
}