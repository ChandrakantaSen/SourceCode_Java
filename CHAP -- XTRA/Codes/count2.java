package All;

import java.io.*;

class count2
{
    public static void main(String args[])throws IOException
    {
        String str;
        char b;
        int i,len,up=0,low=0,dgt=0,spl=0,spc=0;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the string: ");
        str = in.readLine();
        len=str.length();

        for(i=0;i<len;i++)
        {
            b=str.charAt(i);

            if(b>='A'&&b<='Z')
            {
                up++;
            }
            else if(b>='a'&&b<='z')
            {
                low++;
            }
            else if(b>='0'&&b<='9')
            {
                dgt++;
            }
            else if(b==' ')
            {
                spc++;
            }
            else
            {
                spl++;
            }
        }
        System.out.println();
        System.out.println("Total Length: "+len);
        System.out.println("No. of Uppercase: "+up);
        System.out.println("No. of Lowercase: "+low);
        System.out.println("No. of Digit: "+dgt);
        System.out.println("No. of Space: "+spc);
        System.out.println("No. of Special: "+spl);
    }
}