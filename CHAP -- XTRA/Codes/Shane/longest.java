import java.io.*;
public class longest
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String s,s1="",large="";
        int x,max=0,i;
        System.out.println("Enter a sentence");
        s=in.readLine();
        x=s.length();
        for(i=0;i<x;i++)
        {
            if(s.charAt(i)!=' '&&s.charAt(i)!='.')
            {
                s1=s1+s.charAt(i);
            }
            else
            {
                if(s1.length()>max)
                {
                    max=s1.length();
                    large=s1;
                }
                s1="";
            }
        }
        System.out.println("Longest word="+large);
    }
}
                
                
        