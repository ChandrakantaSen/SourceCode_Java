import java.io.*;
class horrible
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("ENTER YOUR STRING");
String s=br.readLine();
char a=' ';
String b="";
String c="";
int i,j,nu=0,sp=0;
for(i=0;i<s.length();i++)
{
if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))

{ b=s.substring(sp,i);
 s=s.substring(i+1,s.length());
 sp=0;
}
for(j=0;j<b.length();j++)
a=b.charAt(j);
c=c+a;
if(b==c)
{
System.out.println(b);
nu++;
    }
}
System.out.println("THE NUMBER OF PALINDROME WORDS IS"+nu);
    }
}