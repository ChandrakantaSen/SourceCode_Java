package string_progs;

import java.io.*;
class sentence_reverse
{
    public static void main(String args[])throws IOException
    {
        int i,len;
        char b=0;
        String str="",str1="",str2="";
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the string: ");
        str=in.readLine();

        str=str+" ";
        len=str.length();

        for(i=0;i<len;i++)
        {
            b=str.charAt(i);

            if(b==' ')
            {
                str1=str2+" "+str1;
                str2="";
            }
            else
            {
                str2=str2+b;
            }
        }
        System.out.println();
        System.out.print("String in Reversed Order: "+str1);
    }
}
