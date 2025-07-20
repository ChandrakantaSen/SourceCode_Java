package Puspendu;

import java.util.*;
class change
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the word :");
        String s=sc.nextLine();
        String news="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='A')
            news=news+'O';
            else if(ch=='a')
            news=news+'o';
            else if(ch=='E')
            news=news+'U';
            else if(ch=='e')
            news=news+'u';
            else
            news=news+ch;
        }
        System.out.println("Word with replaced letters :");
        System.out.println(news);
    }
}
            