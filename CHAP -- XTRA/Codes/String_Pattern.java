import java.io.*;
class String_Pattern
{
    public static void main(String args[])throws IOException
    {
        int len,i;
        char b;
        String str="";
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String: ");
        str=br.readLine();
        len=str.length();
        for(i=0;i<len;i++)
        {
            System.out.println(str.charAt(i));
        }
    }
}