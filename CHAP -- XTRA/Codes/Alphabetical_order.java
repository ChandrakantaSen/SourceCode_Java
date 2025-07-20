import java.io.*;
public class Alphabetical_order
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String s,s1="",s2="";
        int x,i;
        char c;
        System.out.println("Enter a string");
        s=in.readLine();
        x=s.length();
        for(c='a';c<='z';c++)
        {
            for(i=0;i<x;i++)
            {
                if(c==s.charAt(i))
                {
                    s1=s1+c;
                }
            }
        }
        System.out.println("Alphabetical order:"+s1);
        for(c=s.charAt(0);c<=s.charAt(x-1);c++)
        {
            s2=s2+c;
        }
        System.out.println(s2);
    }
}
            
            
           
                    
        