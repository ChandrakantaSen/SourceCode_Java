import java.io.*;
class SMf
{
    public static void main(String args[])throws IOException
    {
        String  s="",s1="",s2="";
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the name: ");
        s=br.readLine();
        s=" "+s;
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
               s1=s1+s.charAt(i+1);
            }
        }
        System.out.println(s1);
        int l1=s1.length();
        for(int i=l1-1;i>=0;i--)
        {
            s2=s2+s1.charAt(i);
        }
        s2=s2.trim();
        s1=s1.trim();
        
        if(s2.equals(s1)==true)
        {
            System.out.print("Magic Sentense = "+s1);
        }
        else
        {
            System.out.print("Not A  Magic Sentense = "+s2);
        }
    }
}