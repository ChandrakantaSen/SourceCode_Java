import java.io.*;
public class alternate
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String s1,s2,s3="";
        int x,i;
        System.out.println("Enter the two strings");
        s1=in.readLine();
        s2=in.readLine();
        x=s1.length();
        for(i=0;i<x;i++)
        {
            s3=s3+s1.charAt(i)+s2.charAt(x-i-1);
        }
        System.out.println(s3);
    }
}

        
        