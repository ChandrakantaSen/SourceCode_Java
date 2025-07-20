package All;

import java.io.*;
class Mixed_Case
{
    public static void main(String args[])throws IOException
    {
        String str,st="";
        char b,c=0;
        int i,len;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the String: ");
        str = in.readLine();
        len=str.length();

        for(i=0;i<len;i++)
        {
            b=str.charAt(i);
            if(b>='A' && b<='Z')
            {
                c=Character.toLowerCase(b);
                st=st+c;
            }
            else if(b>='a' && b<='z')
            {
                c=Character.toUpperCase(b);
                st=st+c;
            }
            else
            {
                st=st+b;
            }
        }
        System.out.println("String is: "+st);
    }
}
