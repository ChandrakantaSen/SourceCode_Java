package Puspendu;

import java.util.*;
class String5
{
public static void main()
{
Scanner sc=new Scanner(System.in);
String s,k,g;
System.out.println("Please enter your first name :");
s=sc.nextLine();
System.out.println("Please enter your middle name :");
k=sc.nextLine();
System.out.println("Please enter your last name :");
g=sc.nextLine();
s=s.concat(k);
s=s.concat(g);
System.out.println("Your full name is : "+s);
}
}