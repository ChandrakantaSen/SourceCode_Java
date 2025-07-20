import java.io.*;
public class Strings
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String s,s1="",s2="";
        int x,i;
        char ch;
        System.out.println("Enter a String");
        s=in.readLine();
        s=s+" ";
        x=s.length();
        for(i=0;i<x;i++)
        {
            if(s.charAt(i)!=' ')
            s1=s1+s.charAt(i);
            else
            {
                ch=Character.toLowerCase(s1.charAt(0));
                s1=ch+s1.substring(1);
                s2=s2+s1+" ";
                s1="";
            }
        }
        System.out.println(s2);
    }
}