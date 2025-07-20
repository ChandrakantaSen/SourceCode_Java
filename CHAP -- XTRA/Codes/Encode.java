import java.util.*;
class Encode
{
    String replace(String word)
    {
        String st="";
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)=='Z')
            st=st+'B';
            else if(word.charAt(i)=='Y')
            st=st+'A';
            else
            st=st+(char)(word.charAt(i)+2);
        }
        return st;
    }
}