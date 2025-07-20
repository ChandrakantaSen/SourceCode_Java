package Puspendu;

import java.util.*;
class replace
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a word :");
        String s=sc.nextLine();String news="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
        if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
        {
            news=news+' ';
        }
        else
        news=news+ch;
    }
System.out.println("The word with vowels removed :");
System.out.println(news);
}
}