import java.io.*;
class Prg1
{
public static void main(String args[])throws IOException
{
String s;
int i,l;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any Text:-");
s=br.readLine();
l=s.length();
for(i=0;i<l;i++)
{
char k=s.charAt(i);
if((k=='A')||(k=='a')||(k=='E')||(k=='e')||(k=='I')||(k=='i')||(k=='O')||(k=='o')||(k=='U')||(k=='u'))
{
System.out.println(k);
    }
}
}
    }