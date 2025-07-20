package string_progs;

import java.io.*;
class str_initials
{
    public static  void main(String args[])throws IOException
    {
        String str,str1="",str2="";
        char b,c;
        int i,len,len1,j;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string: ");
        str = in.readLine();
        str=str+' ';
        len=str.length();
        for(i=0;i<len;i++)
        {
            b=str.charAt(i);
            if(b!=' ')
            {
                str1=str1+b;
                continue;
            }
            len1=str1.length();
            for(j=0;j<len1;j++)
            {
                c = str1.charAt(j);
                if(Character.isUpperCase(c)==true)
                {
                    str2=str2+"."+c;
                }
                System.out.println(str2);
            }
            
            str1="";
            str2="";
        }
    }
}