import java.io.*;
class string27_0
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s;
int i,l,ch,j;
System.out.println("Enter the string");
s=br.readLine();
l=s.length();
do
{
System.out.println("    Menu   ");
System.out.println("Press 1 for first letter of each word");
System.out.println("Press 2 for last letter of each word");
System.out.println("Press 3 for Exit");
System.out.println("Enter your choice");
ch=Integer.parseInt(br.readLine());
switch (ch)
{
case 1:
System.out.println(s.charAt(0));
for(i=1;i<l;i++)
{
if(s.charAt(i)==' ')
{
System.out.println(s.charAt(i+1));
    }
}
break;
case 2:
for(i=1;i<l;i++)
{
if(s.charAt(i)==' ')
{
System.out.println(s.charAt(i-1));
    }
}
System.out.println(s.charAt(l-1));
break;
case 3:
System.out.println("Bye----Bye");
System.exit(0);
break;
default :
System.out.println("Wrong Input");
    }
}
while(true);
}
    }