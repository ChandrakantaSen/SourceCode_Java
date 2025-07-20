import java.io.*;
class consecutive
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the string");
String s=br.readLine();
s=s.toLowerCase();
s=s.concat(" ");
int l=s.length();
int d=0;
int ff=0;
char c,ch;
int a;
for(int i=0;i<l;i++)
{
c=s.charAt(i);
if(c==' ')
continue;    
ff=i+2;
if((int)s.charAt(i+1)-(int)s.charAt(i)==1)
System.out.println(s.substring(i,ff));

if((int)s.charAt(i+1)-(int)s.charAt(i)==1)
d++; 
}
System.out.println( "No.of consecutive alphabet pairs ="+d);
}                                                                     
}

