import java.io.*;
class length 
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter a sentence");
String s=br.readLine();
s=s.concat(" ");
int p=0,max=0;
char c;
String w=" ",
