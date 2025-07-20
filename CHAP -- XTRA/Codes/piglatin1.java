import java.io.*;
//import java.io.*;
class piglatin1
{
public static void main(String args[])throws IOException
{
String s=" ",y=" ",t=" ";
int i=0,l=0;
char k;
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
System.out.println("ENTER THE STRING");
s=in.readLine();
l=s.length();
for(i=0;i<l;i++)
{
k=s.charAt(i);
if(k=='a'||k=='e'||k=='i'||k=='o'||k=='u')
break;
    }
y=s.substring(i,l);
t=s.substring(0,i);
System.out.println(y+t+"ay");
    }
}
