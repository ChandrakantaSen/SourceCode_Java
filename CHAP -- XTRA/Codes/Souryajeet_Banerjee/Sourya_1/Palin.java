import java.io.*;
public class Palin
{
    void Pallindrome(String s)
    {
        String word=" ";
        int l=s.length();
        for(int i=l-1;i>=0;i--)
        {
            word=word+s.charAt(i);
        }
        s=s.trim();
        word=word.trim();
        if(word.equals(s)==true)
        {
            System.out.println("Pallindrome name = "+word);
        }
        else
        {
            System.out.println("Not a Pallindrome name = "+word);
        }
    }
}