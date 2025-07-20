package Puspendu;

import java.util.*;
class nozero
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number :");
        int n=sc.nextInt();
        String num=Integer.toString(n);String news="";
        for(int i=0;i<num.length();i++)
        {
            char ch=num.charAt(i);
            if(ch=='0')
            {
                continue;
            }
            else
            {
            news=news+ch;
            }
        }
        System.out.println("The number with the 0s removed is : "+news);
    }
}
