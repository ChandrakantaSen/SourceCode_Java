/*ENTER A STRING IN MIXED CASE AND THEN FIND THE FREQUENCY OF EACH VOWEL*/
import java.io.*;
class p338_2
{
public static void main(String args[])throws IOException
{
String s;
int i,c1=0,c2=0,c3=0,c4=0,c5=0,l;
char k=' ';
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the string");
s=br.readLine();
l=s.length();
for(i=0;i<l;i++)
{
k=s.charAt(i);
if((k=='a')||(k=='A'))
{
c1++;
}
else if((k=='e')||(k=='E'))
{
c2++;
}
else if((k=='i')||(k=='I'))
{
c3++;
}
else if((k=='o')||(k=='O'))
{
c4++;
}
else if((k=='u')||(k=='U'))
{
c5++;
}
}
System.out.println("The frequency of 'a' or 'A'is"+c1);
System.out.println("The frequency of 'e' or 'E'is"+c2);
System.out.println("The frequency of 'i' or 'I'is"+c3);
System.out.println("The frequency of 'o' or 'O'is"+c4);
System.out.println("The frequency of 'u' or 'U'is"+c5);
}
}