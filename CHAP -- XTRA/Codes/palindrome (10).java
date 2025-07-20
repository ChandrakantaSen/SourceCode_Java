package All;

import java.io.*;
public class palindrome
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String s,s1="",s2="";
        int x,i;
        System.out.println("Enter a string");
        s=in.readLine();
        s=" "+s;
        x=s.length();
        for(i=0;i<x;i++)
        {
            if(s.charAt(i)==' ')
            {
                s1=s1+s.charAt(i+1);
            }
        }
        System.out.println(s1);
        x=s1.length();
        for(i=0;i<x;i++)
        {
            s2=s1.charAt(i)+s2;
        }
        if(s2.equalsIgnoreCase(s1))
        System.out.println("It is a palindrome word");
        else
        System.out.println("Not a palindrome word");
    }
}
        
        
           
            
            
            
        
        