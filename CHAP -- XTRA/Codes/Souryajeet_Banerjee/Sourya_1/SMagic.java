import java.io.*;
class SMagic
{
    public static void main(String args[])throws IOException
    {
        String  s="";
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the name: ");
        s=br.readLine();
        int l=s.length();
        String  s1=" ";
        String  s2=" ";
        s=" "+s;
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                s1=s1+s.charAt(i);
            }
        }
        s1=s1.trim();
       System.out.println(s1);
       /** int l1=s1.length();
        for(int i=l1-1;i>=0;i--)
        {
            s2=s2+s1.charAt(i);
        }
        s2=s2.trim();
        s1=s1.trim();
        System.out.println(s2);
        System.out.println(s1);
        if(s2.equals(s1)==true)
        {
            System.out.print("Magic Sentense = "+s1);
        }
        else
        {
            System.out.print("Not A  Magic Sentense = "+s2);
        }
        */
    }
}