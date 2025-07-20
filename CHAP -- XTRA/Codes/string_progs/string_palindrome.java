package string_progs;

import java.io.*;
class string_palindrome
{
    public static void main(String args[])throws IOException
    {
        int i,len;
        String str="",str1="";
        char b;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter the string: ");
        str=in.readLine();

        len=str.length();

        for(i=len-1;i>=0;i--)
        {
            b=str.charAt(i);
            str1=str1+b;
        }

        if(str.equalsIgnoreCase(str1))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Non Palindrome");
        }
    }
}
