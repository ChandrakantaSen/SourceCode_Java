import java.util.*;
class MaxVowel
{
    String str="";
    
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the strence :");
        str=sc.nextLine();
    }

    int countVowel(String word)
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
                count++;
                break;
            }
        }
        return count;
    }

    void display()
    {
        int pos=0,max=0;
        String word="";
        str=str.trim();
        str=str+" ";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                if(countVowel(str.substring(pos,i))>max)
                {
                    max=countVowel(str.substring(pos,i));
                    word=str.substring(pos,i);
                }
                pos=i+1;
            }
        }
        System.out.println("Word with most vowels is : "+word);
    }

    static void main()
    {
        MaxVowel ob=new MaxVowel();
        ob.input();
        ob.display();
    }
}