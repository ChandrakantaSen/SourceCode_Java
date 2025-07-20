package string_progs;

import java.io.*;
class search_word_frequency
{
    public static void main(String args[])throws IOException
    {
        int i,len,c=0;
        String str="",str1="";
        char b;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the String: ");
        str=in.readLine();

        str=str+" ";
        len=str.length();

        for(i=0;i<len;i++)
        {
            b=str.charAt(i);
            if(b!=' ')
            {
                str1=str1+b;
            }
            else
            {
                if(str1.compareTo("the")==0)
                {
                    c++;
                }
                str1="";
            }
        }
        System.out.println("Frequency of String: "+c);
    }
}