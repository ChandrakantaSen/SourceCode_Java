package Puspendu;

import java.util.*;
class String9
{
public static void main()
{
Scanner sc=new Scanner(System.in);
String s;
int l;
System.out.println("Please enter the text :");
s=sc.nextLine();
l=s.length();
System.out.println("The last character of the entered text is : "+s.charAt(l-1));
}
}