import java.util.*;
class Word
{
    String sent,words[];
    int vowel[],cons[];
    Word(String st)
    {
        sent=st.toLowerCase();
    }
    void input()
    {
        StringTokenizer st=new StringTokenizer(" ");
        words=new String[st.countTokens()];
        int i=0;
        while(st.hasMoreTokens())
        words[i++]=st.nextToken();
    }
    void count()
    {
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words[i].length();j++)
            {
                switch(words[i].charAt(i))
                {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    vowel[i]++;
                    break;
                    default:
                    cons[i]++;
                }
            }
        }
    }
    void display()
    {
        System.out.println("Word \t Vowel \t Consonant");
        for(int i=0;i<words.length;i++)
        {
            System.out.println(words[i]+" "+vowel[i]+" "+cons[i]);
        }
    }
}