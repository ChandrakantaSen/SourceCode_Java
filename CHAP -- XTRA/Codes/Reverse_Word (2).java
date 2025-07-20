package All;

import java.io.*;
class Reverse_Word
{
    public static void main(String args[])throws IOException
    {
        String str,str1="",str2="";
        char b;
        int len;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The String :");
        str=br.readLine();
        str=str+" ";
        len=str.length();
        for(int i=0;i<len;i++)
        {
            b=str.charAt(i);
            if(b==' ')
            {
                str1=str1+" "+str2;
                str2=" ";
            }
            else
            {
                str2=b+str2;
            }
        }
        System.out.println("Reverse word id "+str1);
    }
}
        
        
        