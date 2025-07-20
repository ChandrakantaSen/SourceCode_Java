package Puspendu;

import java.util.*;
class String11
{
public static void main()
{
Scanner sc=new Scanner(System.in);
String s;
int l,c=0;
System.out.println("Please enter the text :");
s=sc.nextLine();
l=s.length();
System.out.println("The number of spaces in  the entered text : ");
for(int i=0;i<l;i++)
{
if(s.charAt(i)==' ')
c++;
}
System.out.println(c);
}
}