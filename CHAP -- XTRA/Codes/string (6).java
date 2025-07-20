package All;

import java.io.*;
public class string
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String s;
        int max=0,f=0,i,x,j;
        char c,max1=' ';  
        System.out.println("Enter a String");
        s=in.readLine();
        x=s.length();
        for(i=0;i<x;i++)
        {
            c=s.charAt(i);
            for(j=0;j<x;j++)
            {
                if(c==s.charAt(j))
                {
                    f=f+1;
                }
            }
            if(f>max)
            {
            max=f;
            max1=c;
        }
            f=0;
        }
        System.out.println("The character with the maximum frequency:"+max1);
        if((max1=='a')||(max1=='e')||(max1=='i')||(max1=='o')||(max1=='u')||(max1=='A')||(max1=='E')||(max1=='I')||(max1=='O')||(max1=='U'))
        {
            System.out.println("The character is a vowel");
        }
        else
        System.out.println("The character is a consonant");
    }
}

       
        
            
            
                
            
            