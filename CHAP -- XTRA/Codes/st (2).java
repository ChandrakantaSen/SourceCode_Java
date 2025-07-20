import java.io.*;
class st
{
    public static void main(String args[])throws IOException
    {
        String s,a,b;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string : -   ");
        s=br.readLine();
        System.out.println("Enter another : -   ");
        b=br.readLine();
        s=s.replace(b,"");
        System.out.println("Your full name is =  "+s);
    }
}