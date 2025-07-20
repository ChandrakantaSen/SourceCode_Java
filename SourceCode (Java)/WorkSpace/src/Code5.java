import java.util.*;
class Code5
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s,w="";
int i;char ch1=0,ch2=0;
System.out.println("Enter a sentence:");
s=sc.nextLine().toUpperCase();
s=s+" ";
for(i=0;i<s.length();i++)
{
char x=s.charAt(i);
if(x==' ')
{
ch1=w.charAt(0);
ch2=w.charAt(w.length()-1);
if((ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U')&&(ch2=='A'||ch2=='E'||ch2=='I'||ch2=='O'||ch2=='U'))
System.out.println(w);
w="";
}
else
{
w=w+x;//creating each word
}
}
}
}