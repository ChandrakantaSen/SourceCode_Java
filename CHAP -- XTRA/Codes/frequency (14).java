package All;

import java.io.*;
public class frequency
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String s;
        int x,i,j,f=0;
        System.out.println("Enter a string");
        s=in.readLine();
        x=s.length();
        for(i=0;i<x;i++)
        {
            for(j=0;j<x;j++)
            {
                if(s.charAt(i)==s.charAt(j))
                f=f+1;
            }
            System.out.println(s.charAt(i)+"-"+f);
            f=0;
        }
    }
}
        
                
        