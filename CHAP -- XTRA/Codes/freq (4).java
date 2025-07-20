import java.io.*;
public class freq
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String s;
        int x,c=0;
        char ch;
        System.out.println("Enter a String");
        s=in.readLine();
        System.out.println("Enter the alphabet of whose frequncy has to be checked");
        ch=(char)(in.read());
        x=s.length();
        for(int i=0;i<x;i++)
        {
            if(s.charAt(i)==ch)
            c=c+1;
        }
        System.out.println("Frequency of "+ch+"="+c);
    }
}

                