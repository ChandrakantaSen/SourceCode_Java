package string_progs;

import java.io.*;
class string_insert
{
    public static void main(String args[])throws IOException
    {
        int i,j,len;
        String str="",str1="";
        char b;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String: ");
        str=in.readLine();
        
        len=str.length();
        str1=str1+str.charAt(0);
        
        for(i=0;i<len;i++)
        {
            b=str.charAt(i);
            
            if(b==' ')
            {
            
            }
            
        }
    }
}