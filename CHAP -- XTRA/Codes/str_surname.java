import java.io.*;
class str_surname
{
    public static void main(String args[])throws IOException
    {
        String s="",s1="",s2="";
        char b;
        int len,i;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string: ");
        s=in.readLine();
        len=s.length();
        for(i=len-1;i>=0;i--)
        {
            b=s.charAt(i);
            if(b==' ')
                break;
        }
        s1=s.substring(i+1);
        System.out.println(s1);
        s2=s.substring(0,i);
        System.out.println(s2);
        System.out.println(s1+" "+s2);
    }
}
