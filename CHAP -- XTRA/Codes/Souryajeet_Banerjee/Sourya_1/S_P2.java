import java.io.*;
class S_P2
{
    public static void main(String args[])throws IOException
    {
        String  s="",s1="",s2="";
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the name: ");
        s=br.readLine();
        s=s+" ";
        s=s.toUpperCase();
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if (ch==' ')
            {
                System.out.println(s.charAt(i-1));
                
            }
        }
    }
}