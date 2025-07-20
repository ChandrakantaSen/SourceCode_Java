package string_progs;

import java.io.*;
class strMaxVowels
{
    public static void main(String args[])throws IOException
    {
        String str,d="",q="";
        int l,p=0,max=0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the string: ");
        str = in.readLine();
        str = str + " ";
        l = str.length();
        for(int i=0;i<l;i++)
        {
            char c = str.charAt(i);
            if(c==' ')
            {
                int l1 = d.length();
                for(int j=0;j<l1;j++)
                {
                    char c1 = d.charAt(j);
                    if(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u')
                    {
                        p++;
                    }
                }
                if(max<p)
                {
                    max=p;
                    q=d;
                }
                p=0;
            }
            else
            {
                d = d+c; 
            }
        }
        System.out.println("Word is: "+q);
    }
}
