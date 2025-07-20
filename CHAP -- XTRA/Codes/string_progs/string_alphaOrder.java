package string_progs;

import java.io.*;
class string_alphaOrder
{
    public static void main(String args[])throws IOException
    {
        int i,j,len;
        String str="";
        char b;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the String: ");
        str=in.readLine();

        len=str.length();
        
        System.out.println("Modified String is: ");
        for(i=65;i<=90;i++)
        {
            for(j=0;j<len;j++)
            {
                b=str.charAt(j);

                if((b==(char)i)||(b==(char)(i+32)))
                    System.out.print(b);
            }
        }
    }
}
