import java.io.*;
//import java.lang.*;
class extract
{
public static void main()
{
String s="january 26 is celebrated as republic day of india";
int p1=s.indexOf("january 26");
int l=s.length();
int l3="january 26".length();
String s2=s.substring(l3+1,l);
String s4="august 15"+" ";
int len=s4.length();
int p3=s.indexOf("republic");
int l2="republic".length();
String s5=s.substring(0,26);
String s9=s4+s2;//" is celebrated as independence day of india";
System.out.println(s9);
System.out.println(s2);
}
}