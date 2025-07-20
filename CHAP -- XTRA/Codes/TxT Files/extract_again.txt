import java.io.*;
import java.lang.*;
class extract_again
{
public static void main()
{
String s=("January 26 is celebrated as republic day of India");
int l=s.length();
String g=s.substring(13+1,l);
String k="August 15"+" ";
int p=s.indexOf("republic day");
String j="independence day"+" ";
System.out.print(k+"is celebrated as"+" "+j+"of india");
    }
}