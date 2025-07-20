package Puspendu;

import java.util.*;
class alphabets
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the sentence :");
        String s=sc.nextLine();
        s=s.toUpperCase();int ctr=0;String rev="";
        for(int i=65;i<=90;i++)
        {
            for(int j=0;j<s.length();j++)
            {
                if((char)i==s.charAt(j))
                {
                ctr++;
                char ch=(char)i;
            if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
            {
                rev=rev+" "+ch;
            }
            }
        }
            
            if(ctr!=0)
            System.out.println((char)i+" occurs "+ctr+" times");
            ctr=0;
        }
        System.out.println("Sentence with only the vowels : "+rev);
    }
}