package All;

import java.io.*;

class Initial_Form
{
    public static void main(String args[])throws IOException
    {
        String str,str1="";
        int i,len,c=0;
        char b;

        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String: ");
        str=in.readLine();
        len=str.length();

        str1=str1+str.charAt(0);
        //System.out.println(str1);

        for(i=0;i<len;i++)
        {
            b=str.charAt(i);
            if(b==' ')
            {
                c++;
                if(c==1)
                {
                    str1=str1+"."+(str.charAt(i+1));
                }
                else if(c==2)
                {
                    str1=str1+"."+(str.substring(i+1,len));
                }
            }
        }
        System.out.println("Initial String is: "+str1);
    }
}