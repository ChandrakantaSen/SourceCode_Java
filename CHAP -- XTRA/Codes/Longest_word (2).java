import java.util.*;
class Longest_word
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String st;
        System.out.println("Enter the sentence :");
        st=sc.nextLine();
        String word="",maxw="";
        st=st.trim();
        st=st+" ";
        int max=0,i;
        for(i=0;i<st.length();i++)
        {
            if(st.charAt(i)!=' ')
            {
                word+=st.charAt(i);
            }
            else
            {
                if(VowelCount(word)>max)
                {
                    max=VowelCount(word);
                    maxw=word;
                }
                word="";
            }
        }
        System.out.println("Word with most vowel : "+maxw);
    }
    static int VowelCount(String word)
    {
        int count=0;
        for(int i=0;i<word.length();i++)
        {
            switch(word.charAt(i))
            {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                count++;break;
            }
        }
        return count;
    }
}