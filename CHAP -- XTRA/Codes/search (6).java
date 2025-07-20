import java.io.*;
public class search
{
 public static void main(String args[])throws IOException
 {
     int a=0;char c,char d;
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter a String");
     String s=br.readLine();
     int l=s.length();
     for(int i=0;i<l;i++)
     {
          c=s.charAt(i);
        }
        System.out.println("Enter the word to bre search");
        String t=br.readLine();
        int le=t.length();
        for(int i=0;i<le;i++)
        {
            d=t.charAt(i);
        }
        if(c==d)
        {
            a++;
            System.out.println("word present "+a);
        }
        else
        {
            System.out.println("Word not present");
        }
    }
}
