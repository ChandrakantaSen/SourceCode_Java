import java.io.*;
class Reverse_Word1
{
    public static void main(String args[])throws IOException
    {
        int len;
        char b=' ';
        String str,str1="",str2="";
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The String:");
        str=br.readLine();
        str=str+" ";
        len=str.length();
        for(int i=0;i<len;i++)
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
        System.out.println(str1);
    }
}