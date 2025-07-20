package All;

import java.io.*;
class Rev_Order
{
    public static void main(String args[])throws IOException
    {
        String str,str1=" ",str2=" ",str3=" ";
        char b=0;
        int i,len;
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the String");
        str=in.readLine();
        str=str+" ";
        len=str.length();
        
        for(i=0;i<len;i++)
        {
            b=str.charAt(i);
            if(b==' ')
            {
               str2=str3+" "+str2;
               str3=" ";
            }
            else
            {
                str3=str3+b;
            }
        }
        System.out.println("Reverse String is: "+str2);
    }
}