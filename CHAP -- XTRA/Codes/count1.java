package All;

import java.io.*;
class count1
{
    public static void main(String args[])throws IOException
    {
        String str;
        char b;
        int i,len,c=0,w=0,chr=0;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the string: ");
        str=in.readLine();

        len=str.length();

        for(i=0;i<len;i++)
        {
            b=str.charAt(i);

            if(b==' ')
            {
                c++;
            }
        }
        w=c+1;
        chr=len-c;

        System.out.println("No. of Space: "+c);
        System.out.println("No. of Word: "+w);
        System.out.println("No. of character: "+chr);
    }
}
