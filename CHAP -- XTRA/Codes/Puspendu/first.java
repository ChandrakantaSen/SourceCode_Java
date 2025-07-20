package Puspendu;

import java.util.*;
class first
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the sentence :");
        String s=sc.nextLine();
        s=s+" ";int pos=0;String sub,fin="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                sub=s.substring(pos,i);
                pos=1+i;
                fin=fin+sub.charAt(0);
            }
        }
        System.out.println("OUTPUT :");
        System.out.println(fin);
    }
}
                