package Puspendu;

import java.util.*;
class Vowels
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the word :");
        String s=sc.nextLine();int x=0;boolean b=false;
        char ch,ch1;int ctr=0;char a[] =new char[s.length()];
        outer:for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
            {
                ch1=ch;
                for(int y=0;y<a.length;y++)
                {
                    if(a[y]==ch1)
                    b=true;
                }
                if(b!=true)
                {
                for(int j=0;j<s.length();j++)
                {
                    if(s.charAt(j)==ch1)
                    ctr++;
                }
                System.out.println(ch1+" is present "+ctr+" times");
               }
            else
            continue outer;
             a[x++]=ch1;
                ctr=0;
            }
            }
        }
    }