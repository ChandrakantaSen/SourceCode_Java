import java.io.*;
class S_ii
{
    public static void main(String args[])throws IOException
    {
        String  s="",s1="",s2="";
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the name:- ");
        s=br.readLine();
        s=" "+s;
        int l=s.length();
        int l1=s.lastIndexOf(' ');
        s2=s.substring(l1,l);
        for(int i=0;i<l1;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
               s1=s1+s.charAt(i+1);
            }
        }
        System.out.print(s1+s2);
    }
}