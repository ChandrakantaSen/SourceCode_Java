package Puspendu;

import java.util.*;
class String10
{
public static void main()
{
Scanner sc=new Scanner(System.in);
String s;
int l;
System.out.println("Please enter the text :");
s=sc.nextLine();
l=s.length();
System.out.println("Each character of the entered text are as follows : ");
for(int i=0;i<l;i++)
{
System.out.println(s.charAt(i));
}
}
}