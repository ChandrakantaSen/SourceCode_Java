import java.io.*;
public class Strings
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String word;
        System.out.println("Enter a string");
        word=in.readLine();
        Strings t=new Strings();
        t.replace(word);
    }
    void replace(String word)
    {
        int x,i,n;
        String s="";
        x=word.length();
        for(i=0;i<x;i++)
        {
            if(word.charAt(i)!=' ')
            {
                n=(int)(word.charAt(i))+2;
                s=s+(char)n;
            }
            else
            s=s+" ";
        }
        System.out.println(s);
    }
}
        
    
    