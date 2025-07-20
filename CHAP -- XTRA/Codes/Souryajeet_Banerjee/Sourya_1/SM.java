import java.io.*;
class SM
{
    public static void main(String args[])throws IOException
    {
        String  s="",s1="",s2="";
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the name: ");
        s=br.readLine();
        int l=s.length();
        for(int i=l-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
               s1=s1+s.charAt(i);
            }
        }
        s2=s+s1;
        System.out.print(s2);
    }
}