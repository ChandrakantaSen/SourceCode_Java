import java.io.*;
public class mixed
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String s,s1="";
        int x,i;
        System.out.println("Enter a String");
        s=in.readLine();
        x=s.length();
        for(i=0;i<x;i++)
        {
            if((s.charAt(i)>='a')&&(s.charAt(i)<='z'))
            {
                s1=s1+s.charAt(i);
            }
        }
        for(i=0;i<x;i++)
        {
            if((s.charAt(i)>='A')&&(s.charAt(i)<='Z'))
            {
                s1=s1+s.charAt(i);
            }
        }
        System.out.println(s1);
    }
}
        
                
                
        