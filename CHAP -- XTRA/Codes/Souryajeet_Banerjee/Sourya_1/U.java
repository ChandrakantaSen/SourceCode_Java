import java.io.*;
public class U
{
    void removevowel(String str)
    {
        int l=str.length();
        for(int i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
            {
                System.out.println(ch);
            }
        }
    }
}