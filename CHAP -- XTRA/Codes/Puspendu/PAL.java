package Puspendu;

import java.util.*;
class PAL
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the sentence :");
        String s=sc.nextLine();
        s=s+" ";int pos=0;String sub;
        PAL obj=new PAL();
        System.out.println("Palindrome Words :");
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                sub=s.substring(pos,i);
                pos=1+i;
                boolean b=obj.Pal(sub);
                if(b==true)
                System.out.println(sub);
            }
        }
    }
    public boolean Pal(String sub)
    {
        String rev="";
        for(int i=sub.length()-1;i>=0;i--)
        {
            rev=rev+sub.charAt(i);
        }
        if(rev.equals(sub))
        return true;
        else
        return false;
    }
}
        