package string_progs;

import java.io.*;
class string_firstAlphaUpper
{
    public static void main(String args[])throws IOException
    {
        int i,j,len;
        String str="",str1="";
        char b;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the String: ");
        str=in.readLine();
        str=' '+str;
        len=str.length();
        
        for(i=0;i<len;i++)
        {
            b=str.charAt(i);
            if(b==' ')
            {
                b=str.charAt(i+1);
                str1=str1+' '+Character.toUpperCase(b);
                i+=1;
            }
            else
            {
                str1=str1+b;
            }
        }
        System.out.println();
        System.out.print("Modified String: "+str1);
        
    }
}
