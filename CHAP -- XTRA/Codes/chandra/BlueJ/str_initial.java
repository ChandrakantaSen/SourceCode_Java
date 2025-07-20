import java.io.*;
class str_initial
{
    public static void main(String args[])throws IOException
    {
        String str,str1="";
        char b;
        int len,i,d=0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the String: ");
        str=in.readLine();
        str=str+" ";
        len=str.length();
        for(i=0;i<len;i++)
        {
            b=str.charAt(i);
            if(Character.isWhitespace(b))
            {
                d++;
                if(d==1)
                {
                    str1=str1+"."+b;
                }
            }
        }
    }
}