0 import java.io.*;
class no_alphL
{
public static void main(String args[])throws IOException
{
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br= new BufferedReader(ir);
String s,p;
int flag=0;
System.out.println("enter a sentence");
s=br.readLine();
s=s.toLowerCase();
System.out.println("enter the word with special character present in the sentence");
p=br.readLine();
p=p.toLowerCase();
int l=p.length();
System.out.print(" special character ="+" ");
for(int i=0;i<l;i++)
{
if((int)p.charAt(i)>=97 && (int)p.charAt(i)<=122)
flag=1;
else 
System.out.print(p.charAt(i));
    }
    }}
    