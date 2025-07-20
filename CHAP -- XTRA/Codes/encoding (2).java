import java.io.*;
public class encoding
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String s,s1="";
        int x,i,n;
        char ch,c;
        System.out.println("Enter a String");
        s=in.readLine();
        x=s.length();
        for(i=0;i<x;i++)
        {
            ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                if(90-(int)ch<2)
                {
                    n=64+(2-(90-(int)ch));
                    c=(char)n;
                    s1=s1+c;
                }
                else
                {
                    n=(int)ch+2;
                    c=(char)n;
                    s1=s1+c;
                }
            }
            else
            {
                if(90-(int)ch<6)
                {
                    n=64+(6-(90-(int)ch));
                    c=(char)n;
                    s1=s1+c;
                }
                else
                {
                    n=(int)ch+6;
                    c=(char)n;
                    s1=s1+c;
                }
            }
        }
        System.out.println(s1);
    }
}
        
        