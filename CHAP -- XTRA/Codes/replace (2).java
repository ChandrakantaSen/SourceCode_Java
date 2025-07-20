import java.io.*;
class replace
{
public static void main(String args[])throws IOException
{
String s,g,t;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter any text : - ");
s=br.readLine();
System.out.println("Enter the word to be replaced : - ");
t=br.readLine();
System.out.println("Enter the word to be add : - ");
g=br.readLine();
s=s.replace(t,g);
System.out.println(s);
    }
}